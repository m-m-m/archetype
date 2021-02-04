package ${package}.client.place.navigation;

import ${package}.client.place.product.ProductController;

import io.github.mmm.ui.api.controller.action.UiActionNavigate;
import io.github.mmm.ui.api.widget.menu.UiMenu;
import io.github.mmm.ui.api.widget.menu.UiNavigationBar;
import io.github.mmm.ui.spi.controller.AbstractUiController;
import io.github.mmm.ui.spi.controller.AbstractUiControllerNavigation;

/**
 * {@link AbstractUiController Controller} for navigation dialog.
 */
public class NavigationController extends AbstractUiControllerNavigation<UiNavigationBar> {

  /**
   * The constructor.
   */
  public NavigationController() {

    super();
  }

  @Override
  protected UiNavigationBar createView() {

    UiNavigationBar view = UiNavigationBar.of();
    UiMenu menu = view.addMenu("Data");
    menu.addItem(UiActionNavigate.ofId(ProductController.ID));
    return view;
  }

}
