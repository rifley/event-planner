public class Event {
  private int mGuests;
  private String mFood;
  private String mBeverages;
  private String mEntertainment;

  public Event(int guests, String food, String bevs, String entertainment) {
    mGuests = guests;
    mFood = food;
    mBeverages = bevs;
    mEntertainment = entertainment;
  }

  public int getGuests(){
    return mGuests;
  }
  public String getFood(){
    return mFood;
  }
  public String getBevs(){
    return mBeverages;
  }
  public String getEntertainment(){
    return mEntertainment;
  }

  public int getPrice(Event party){

  }


}
