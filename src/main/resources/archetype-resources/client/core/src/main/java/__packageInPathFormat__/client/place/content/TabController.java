package ${package}.client.place.content;

import io.github.mmm.ui.api.controller.UiEmbedding;
import io.github.mmm.ui.api.controller.UiPlace;
import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.spi.controller.AbstractUiController;

/**
 * {@link AbstractUiController Controller} for content dialogs that are displayed in a tab.
 *
 * @param <V> type of the {@link #getView() view}.
 */
public abstract class TabController<V extends UiRegularWidget> extends AbstractUiController<V> {

  /**
   * The constructor.
   */
  public TabController() {

    super();
  }

  @Override
  public String getTitle() {

    return getId();
  }

  @Override
  protected UiEmbedding doShow(UiPlace newPlace, UiEmbedding newSlot) {

    return new UiEmbedding(ID_CONTENT, getId());
  }

}
