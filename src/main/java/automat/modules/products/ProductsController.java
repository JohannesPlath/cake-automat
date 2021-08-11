package automat.modules.products;

import automat.core.eventbus.generic.IEvent;
import automat.core.eventbus.generic.IEventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.TextFlow;

public class ProductsController implements IEventHandler {

  public TextFlow textFlow;
  public TextArea textArea;

  private String messages = "";

  @FXML
  public void initialize() {
    System.out.println("--- ProductsController.initialize ---");
  }

  @Override
  public void handle(IEvent<?> event) {
    System.out.println(event.toString());
  }

}
