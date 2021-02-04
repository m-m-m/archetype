package ${package}.shared.model;

import io.github.mmm.bean.BeanFactory;
import io.github.mmm.bean.Mandatory;
import io.github.mmm.entity.bean.EntityBean;
import io.github.mmm.property.number.bigdecimal.BigDecimalProperty;
import io.github.mmm.property.string.StringProperty;
/**
 * This is just an example entity to get started. Feel free to delete and replace or refactor as needed...
 */
public interface Product extends EntityBean {

  /** @return the name of the product. */
  @Mandatory
  StringProperty Name();

  /** @return the price of the product in EURO (for simplicity, feel free to integrate with javax.money). */
  @Mandatory
  BigDecimalProperty Price();

  /** @return the optional description of the product with additional details. */
  StringProperty Description();

  /**
   * @return a new instance of {@link Product}.
   */
  static Product of() {

    return BeanFactory.get().create(Product.class);
  }

}