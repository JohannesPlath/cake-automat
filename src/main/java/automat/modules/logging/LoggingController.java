package automat.modules.logging;

import automat.core.eventbus.generic.EventBus;
import automat.core.eventbus.generic.IEvent;
import automat.core.eventbus.generic.IEventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class LoggingController implements IEventHandler {

  public TextArea textArea;
  private String entries;

  @FXML
  public void initialize() {
    EventBus.getInstance().register(LoggingEvent.LOG, this);
    entries = "";
  }

  @Override
  public void handle(IEvent<?> event) {
    addMessage(event.getData().toString());
  }

  public void addMessage(String msg) {
    entries = entries.concat(msg.concat("\n"));
    textArea.setText(entries);
  }
}
