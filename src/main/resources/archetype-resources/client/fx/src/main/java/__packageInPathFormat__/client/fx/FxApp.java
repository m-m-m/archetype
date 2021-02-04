package ${package}.client.fx;

import io.github.mmm.ui.api.controller.UiNavigationManager;
import io.github.mmm.ui.fx.FxApplication;
import io.github.mmm.ui.spi.controller.AbstractUiNavigationManager;
import javafx.application.Application;

/**
 * {@link FxApplication} for to run this UI with JavaFx.
 */
public class FxApp extends FxApplication {

  @Override
  public void start() {

    ((AbstractUiNavigationManager) UiNavigationManager.get()).init();
  }

  /**
   * @param args the command-line arguments.
   */
  public static void main(String[] args) {

    Application.launch(FxApp.class, args);
  }

}
