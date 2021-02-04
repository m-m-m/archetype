package ${package}.client.place.home;

import io.github.mmm.ui.api.controller.UiEmbedding;
import io.github.mmm.ui.api.controller.UiPlace;
import io.github.mmm.ui.api.widget.UiText;
import io.github.mmm.ui.api.widget.panel.UiVerticalPanel;
import io.github.mmm.ui.spi.controller.AbstractUiController;
import io.github.mmm.ui.spi.controller.AbstractUiControllerContent;

/**
 * {@link AbstractUiController Controller} for home dialog.
 */
public class HomeController extends AbstractUiControllerContent<UiVerticalPanel> {

  /**
   * The constructor.
   */
  public HomeController() {

    super();
  }

  @Override
  public String getId() {

    return ID_HOME;
  }

  @Override
  public String getTitle() {

    return "Welcom to ${rootArtifactId}!";
  }

  @Override
  protected UiEmbedding doShow(UiPlace newPlace, UiEmbedding newSlot) {

    return UiEmbedding.HOME;
  }

  @Override
  protected UiVerticalPanel createView() {

    UiVerticalPanel view = UiVerticalPanel.of();
    UiText text = UiText.of("Welcome to ${rootArtifactId} application!");
    view.addChild(text);
    return view;
  }

}
