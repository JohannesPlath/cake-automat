package automat.modules.logging;

import automat.core.eventbus.generic.IEvent;

public class LoggingEvent<T> implements IEvent {

  public static String LOG = "LOG";
  private String type;
  private String message;

  private T payload;

  public LoggingEvent(String type, String message) {
    this.type = type;
    this.message = message;
  }

  // TODO: introduce category for filtering
//  public LoggingEvent(String category, String message) {
//  }

  @Override
  public T getData() {
    return (T) message;
  }

  @Override
  public String getType() {
    return type;
  }

}
