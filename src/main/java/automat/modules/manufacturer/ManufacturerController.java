package automat.modules.manufacturer;

import automat.core.eventbus.generic.EventBus;
import automat.modules.logging.LoggingEvent;
import javafx.event.ActionEvent;
import javafx.scene.text.TextFlow;

public class ManufacturerController {

  public TextFlow textFlow;

  public void onClick(ActionEvent actionEvent) {
    EventBus.getInstance().dispatch(new LoggingEvent(LoggingEvent.LOG, "ein Klick"));
  }
}
