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
      cost =+ 4;
    }
    else if(food.equals("fish")){
      cost =+ 6;
    }
    else if(food.equals("vegetarian")){
      cost =+ 5;
    }
    else if(food.equals("steak")){
      cost =+ 6;
    }
    return cost;
  }
  public int drinkCost(){
    int cost = 0;
    String drinks = mBeverages;
    if(drinks.equals("non-alcoholic")){
      cost =+ 1;
    }
    else if(drinks.equals("wine")){
      cost =+ 5;
    }
    else if(drinks.equals("beer")){
      cost =+ 3;
    }
    else if(drinks.equals("full bar")){
      cost =+ 10;
    }
    return cost;
  }

  public int entertainmentCost(){
    int cost = 0;
    String entertainment = mEntertainment;
    if(entertainment.equals("live singer")){
      cost =+ 120;
    }
    else if(entertainment.equals("live band")){
      cost =+ 250;
    }
    else if(entertainment.equals("dj")){
      cost =+ 80;
    }
    return cost;
  }

  public int totalCost(int guests, int foodCost, int drinkCost, int entertainmentCost){
    int totalCost = 0;
    totalCost = guests * (foodCost + drinkCost) + entertainmentCost;
    return totalCost;
  }
}
