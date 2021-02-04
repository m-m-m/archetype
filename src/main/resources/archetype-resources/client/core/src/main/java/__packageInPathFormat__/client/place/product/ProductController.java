package ${package}.client.place.product;

import ${package}.client.place.content.TabController;

import io.github.mmm.ui.spi.controller.AbstractUiController;

/**
 * {@link TabController Controller} for {@link ProductView}.
 */
public class ProductController extends TabController<ProductView> {

  /** @see #getId() */
  public static final String ID = "Product";

  /**
   * The constructor.
   */
  public ProductController() {

    super();
  }

  @Override
  public String getId() {

    return ID;
  }

  @Override
  protected ProductView createView() {

    return new ProductView();
  }

}
