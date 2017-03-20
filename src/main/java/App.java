import java.io.Console;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/"), (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/welcome.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    Console myConsole = System.console();
    boolean programRunning = true;
    Event party = new Event(0,"","","");


    while(programRunning){
      System.out.println("Welcome to my awesome, rad, admittedly-out-of-touch event planner! Type 'guests' to set how many guests will be coming to your event. Type 'food' to select which food will be served at your event. Type 'drinks' to select which drinks will be served at your event. Type 'entertainment' to select which type of entertainment will best suit your event. When you've made a selection for each, type 'find cost' to calculate the total cost of your event. Type exit at any time to eject.");
      String userNavigation = myConsole.readLine();
      if(userNavigation.equals("guests")){
        System.out.println("How many guests are going to be attending? I can only understand positive integers: ");
        String guestsInput = myConsole.readLine();
        int guests = Integer.parseInt(guestsInput);
        //Can't figure out how to stop this from breaking if user inputs non numeric character//
        if(guests>150){
          System.out.println("WOW! You have a lot of friends! Use this coupon 'many friends' at checkout to recieve a discount because you have " + guests + " attending. Just WOW");
          party.setGuests(guests);
        }
        else if(guests>0){
          System.out.println("Awesome! I've made a note that " + guests + " are going to attend.");
        }
        else{
          System.out.println("Sorry, I'm unable to compute your response. Redirecting.. ");
        }
      }
      else if(userNavigation.equals("food")){
        System.out.println("What food would you like to serve at your event? Your choices are: 'chicken', 'fish', 'vegetarian', and 'steak'.");
        String foodInput = myConsole.readLine();
        if((foodInput.equals("chicken"))||(foodInput.equals("fish"))||(foodInput.equals("vegetarian"))||(foodInput.equals("steak"))){
          System.out.println("I've made a note that we will be serving " + foodInput + " at your event");

          party.setFood(foodInput);
        }
        else{
          System.out.println("Sorry, I don't understand your response. Redirecting.. ");
        }
      }
      else if(userNavigation.equals("drinks")){
        System.out.println("What would you like to do in the way of beverages at your event? Your choices are: 'non-alcoholic', 'beer', 'wine', and 'full bar'");
        String drinkInput = myConsole.readLine();
        if((drinkInput.equals("non-alcoholic"))||(drinkInput.equals("beer"))||(drinkInput.equals("wine"))||(drinkInput.equals("full bar"))){
          System.out.println("I've made a note of your choice! ");
          party.setBevs(drinkInput);
        }
        else{
          System.out.println("Sorry, I don't understand your response. Redirecting.. ");
        }
      }
      else if(userNavigation.equals("entertainment")){
        System.out.println("How would you like to entertain the guests at your event? Your choices are: 'live singer', 'live band', or 'dj'");
        String funInput = myConsole.readLine();
        if((funInput.equals("live singer"))||(funInput.equals("live band"))||(funInput.equals("dj"))){
          System.out.println("I've made a note of your choice! ");
          party.setEntertainment(funInput);
        }
        else{
          System.out.println("Sorry, I don't understand your response. Redirecting.. ");
        }
      }
      else if(userNavigation.equals("find cost")){
        System.out.println("Enter any coupons you may have: ");
        String userCoupon = myConsole.readLine();
        int finalCost = 0;
        int guests = party.getGuests();
        int foodCost = party.foodCost();
        int drinksCost = party.drinkCost();
        int entertainmentCost = party.entertainmentCost();
        finalCost = totalCost(guests, foodCost, drinksCost, entertainmentCost);
        if(guests > 150 && userCoupon.equals("many friends")) {
          int newCost = finalCost - 80;
          System.out.println("The final cost of your event is going to be $" + newCost + "! Thank you! You can edit your settings at any time and get a new quote.");
        }
        else if(userCoupon.equals("love")) {
          int newCost = finalCost - 50;
          System.out.println("The final cost of your event is going to be $" +finalCost + "! Thank you for appreciating the wonder of life! You can edit your settings at any time and get a new quote.");
        }
        else{
          System.out.println("The final cost of your event is going to be $" + finalCost + "! Thank you! You can edit your settings at any time and get a new quote.");
        }
      }
      else if(userNavigation.equals("exit")){
        programRunning = false;
      }
      else{
        System.out.println("Sorry, I am not programmed to recognize that response. Try to be more particular, or in this instance type exactly what you see in the open single quotes to get where you'd like to go.");
      }
    }
  }
  public static int totalCost(int guests, int foodCost, int drinkCost, int entertainmentCost){
    int newCost = 0;
    newCost = guests * (foodCost + drinkCost) + entertainmentCost;
    return newCost;
  }

}
