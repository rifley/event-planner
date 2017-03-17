import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorectly_true(){
    Event testEvent = new Event(1,"","","");
    assertEquals(true, testEvent instanceof Event);
  }
  @Test
  public void eventProperties_getsGuests_10(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals(10, testEvent.getGuests());
  }
  @Test
  public void eventProperties_getsFood_chicken(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals("chicken", testEvent.getFood());
  }
  @Test
  public void eventProperties_getsBeverages_beer(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals("beer", testEvent.getBevs());
  }
  @Test
  public void eventProperties_getsEntertainment_band(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals("band", testEvent.getEntertainment());
  }


}
