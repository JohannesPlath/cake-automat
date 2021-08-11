package automat.core.eventbus.generic;

/**
 * interface describing a generic event, and it's associated meta data, it's this what's going to
 * get sent in the bus to be dispatched to intrested Subscribers
 *
 */
public interface IEvent<T> {

  /**
   * @return the stored data associated with the event
   */
  T getData();
  String getType();
}
