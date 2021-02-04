package ${package}.client.place.content;

import io.github.mmm.ui.api.UiLocalizer;
import io.github.mmm.ui.api.controller.UiController;
import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.tab.UiTab;
import io.github.mmm.ui.api.widget.tab.UiTabPanel;
import io.github.mmm.ui.spi.controller.AbstractUiController;
import io.github.mmm.ui.spi.controller.AbstractUiControllerContent;

/**
 * {@link AbstractUiController Controller} for content dialog.
 */
public class ContentController extends AbstractUiControllerContent<UiTabPanel> {

  private UiTab homeTab;

  /**
   * The constructor.
   */
  public ContentController() {

    super();
  }

  @Override
  protected UiTabPanel createView() {

    return UiTabPanel.of();
  }

  @Override
  protected void onReset() {

    super.onReset();
    this.homeTab = null;
  }

  @Override
  protected boolean doEmbed(String slotId, UiController<?> childController) {

    UiRegularWidget child = childController.getView();
    UiTabPanel tabPanel = getView();
    if (ID_HOME.equals(slotId)) {
      if (this.homeTab == null) {
        this.homeTab = tabPanel.addTab("Home", child, 0);
      } else {
        tabPanel.setActiveChildIndex(0);
      }
    } else {
      UiTab tab = tabPanel.getChildById(slotId);
      if (tab != null) {
        tab.setChild(child);
      } else {
        String text = UiLocalizer.get().localize(slotId);
        tab = tabPanel.addTab(text, child);
        tab.setId(slotId);
        tab.setClosable(true);
      }
      tabPanel.setActiveChild(tab);
    }
    return true;
  }

}
