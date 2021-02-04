package ${package}.client.place.page;

import io.github.mmm.ui.api.controller.UiEmbedding;
import io.github.mmm.ui.api.controller.UiNavigationManager;
import io.github.mmm.ui.api.controller.UiPlace;
import io.github.mmm.ui.api.widget.panel.UiBorderPanel;
import io.github.mmm.ui.api.widget.window.UiMainWindow;
import io.github.mmm.ui.spi.controller.AbstractUiController;
import io.github.mmm.ui.spi.controller.AbstractUiControllerPage;

/**
 * {@link AbstractUiController Controller} for page dialog.
 */
public class PageController extends AbstractUiControllerPage {

  /**
   * The constructor.
   */
  public PageController() {

    super();
  }

  @Override
  public String getTitle() {

    return "Page";
  }

  @Override
  protected UiEmbedding doShow(UiPlace newPlace, UiEmbedding newSlot) {

    embed(UiEmbedding.NAVIGATION, UiNavigationManager.get().getController(ID_NAVIGATION));
    // embed(UiEmbedding.SLOT_HEADER, UiNavigationManager.get().getController(ID_HEADER));
    // embed(UiEmbedding.SLOT_FOOTER, UiNavigationManager.get().getController(ID_HEADER));
    return super.doShow(newPlace, newSlot);
  }


}
