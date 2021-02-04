package ${package}.client.place.product;

import ${package}.shared.model.Product;

import io.github.mmm.base.placement.Direction;
import io.github.mmm.marshall.JsonFormat;
import io.github.mmm.ui.api.attribute.AttributeWriteValue;
import io.github.mmm.ui.api.binding.data.UiDataBinding;
import io.github.mmm.ui.api.datatype.chart.UiDataSeriesDouble;
import io.github.mmm.ui.api.datatype.chart.UiDataSet;
import io.github.mmm.ui.api.event.UiEvent;
import io.github.mmm.ui.api.event.action.UiActionDelete;
import io.github.mmm.ui.api.event.action.UiActionReset;
import io.github.mmm.ui.api.event.action.UiActionSave;
import io.github.mmm.ui.api.widget.button.UiButton;
import io.github.mmm.ui.api.widget.chart.UiBarChartHorizontal;
import io.github.mmm.ui.api.widget.form.UiFormPanel;
import io.github.mmm.ui.api.widget.panel.UiButtonPanel;
import io.github.mmm.ui.api.widget.panel.UiCustomVerticalPanel;

/**
 * {@link io.github.mmm.ui.api.controller.UiController#getView() View} of {@link ProductController}.
 */
public class ProductView extends UiCustomVerticalPanel implements AttributeWriteValue<Product> {

  private final UiDataBinding binding;

  private Product product;

  private UiFormPanel<Product> form;

  /**
   * The constructor.
   */
  public ProductView() {

    super();
    this.binding = new UiDataBinding();
    this.product = Product.of();
    this.form = this.binding.createFormPanel(this.product);
    addChild(this.form);

    UiActionReset resetAction = this::onReset;
    UiButton resetButton = UiButton.of(resetAction);
    UiActionSave saveAction = this::onSave;
    UiButton saveButton = UiButton.of(saveAction);
    UiActionDelete deleteAction = this::onDelete;
    UiButton deleteButton = UiButton.of(deleteAction);
    UiButtonPanel buttonPanel = UiButtonPanel.of(resetButton, saveButton, deleteButton);
    addChild(buttonPanel);
  }

  private void onReset(UiEvent e) {

    this.form.setValue(this.product);
  }

  private void onSave(UiEvent e) {

    this.product = getValue();
    String json = JsonFormat.of().write(this.product);
    System.out.println(json);
  }

  private void onDelete(UiEvent e) {

    System.out.println("Deleted product...");
  }

  @Override
  public Product getValue() {

    return this.form.getValue();
  }

  @Override
  public void setValue(Product product) {

    this.product = product;
    this.form.setValue(product);
  }


}
