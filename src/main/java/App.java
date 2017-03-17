import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();
    boolean programRunning = true;
    while(programRunning){
      System.out.println("Welcome to my awesome, rad, admittedly-out-of-touch event planner! Type 'guests' to set how many guests will be coming to your event. Type 'food' to select which food will be served at your event. Type 'drinks' to select which drinks will be served at your event. Type 'entertainment' to select which type of entertainment will best suit your event. Type exit at any time to eject.");
      String userNavigation = myConsole.readLine();
      if(userNavigation.equals("guests")){
        System.out.println("cheese");
      }
      else if(userNavigation.equals("food")){
        System.out.println("cheese");
      }
      else if(userNavigation.equals("drinks")){
        System.out.println("cheese");
      }
      else if(userNavigation.equals("entertainment")){
        System.out.println("cheese");
      }
      else if(userNavigation.equals("exit")){
        programRunning = false;
      }
      else{
        System.out.println("Sorry, I am not programmed to recognize that response. Try to be more particular, or in this instance type exactly what you see in the open single quotes to get where you'd like to go.");
      }
    }
  }

}
