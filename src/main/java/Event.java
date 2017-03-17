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

  public int foodCost(){
    int cost = 0;
    String food = mFood;
    if(food.equals("chicken")){
      cost =+ 6;
    }
    else if(food.equals("fish")){
      cost =+ 8;
    }
    else if(food.equals("vegetarian")){
      cost =+ 5;
    }
    else if(food.equals("steak")){
      cost =+ 7;
    }
    return cost;
  }

  public int calculatePrice(Event party){
    int people = party.mGuests;
    String food = party.mFood;
    String drinks = party.mBeverages;
    String passTime = party.mEntertainment;
    int totalCost = 0;


    return totalCost;


  }

}
