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
  public void eventProperties2_getsFood_chicken(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals("chicken", testEvent.getFood());
  }
  @Test
  public void eventProperties3_getsBeverages_beer(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals("beer", testEvent.getBevs());
  }
  @Test
  public void eventProperties4_getsEntertainment_band(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals("band", testEvent.getEntertainment());
  }
  @Test
  public void findCost_addFoodCost_int(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals(4, testEvent.foodCost());
  }
  @Test
  public void findCost2_addBeverageCost_int(){
    Event testEvent = new Event(10, "chicken", "beer", "band");
    assertEquals(3, testEvent.drinkCost());
  }
  @Test
  public void findCost3_addEntertainmentCost_int(){
    Event testEvent = new Event(10, "chicken", "beer", "live band");
    assertEquals(250, testEvent.entertainmentCost());
  }
  // @Test
  // public void totalCost_addUpAllCosts_int(){
  //   Event testEvent = new Event(10, "chicken", "beer", "live band");
  //   int food = testEvent.foodCost();
  //   int drink = testEvent.drinkCost();
  //   int fun = testEvent.entertainmentCost();
  //   assertEquals(320, testEvent.totalCost(10, food, drink, fun));
  // }


}
