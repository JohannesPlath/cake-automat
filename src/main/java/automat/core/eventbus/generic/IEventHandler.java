package automat.core.eventbus.generic;

public interface IEventHandler {
  /**
   * Consume the events dispatched by the bus, events passed as parameter are can only be of type
   * declared by the supports() Set
   */
  void handle(IEvent<?> event);

}
