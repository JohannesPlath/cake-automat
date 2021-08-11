package automat.core.eventbus.generic;

import java.util.HashMap;
import java.util.Map;

public class EventBus {

  private static EventBus INSTANCE;

  Map<String, IEventHandler> eventHandlerMap;

  public static EventBus getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new EventBus();
    }
    return INSTANCE;
  }

  private EventBus() {
    eventHandlerMap = new HashMap<>();
  }

  public void register(String eventType, IEventHandler handler) {
    eventHandlerMap.put(eventType, handler);
  }

  public void dispatch(IEvent<?> event) {
    for (Map.Entry<String, IEventHandler> entry : eventHandlerMap.entrySet()) {
      if (event.getType().equals(entry.getKey())) {
        IEventHandler handler = entry.getValue();
        handler.handle(event);
      }
    }
  }

}
