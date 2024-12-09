import java.util.Scanner;
public class Game{
    public static void main(String[] args) {
      Adventurer Opp = new Archer("Night", 100);
      //do this once
      Scanner userInput = new Scanner(System.in);
      //You can do the rest many times:
      System.out.println("Enter username: ");
      //Read one line of user input
      String userName = userInput.nextLine();
      //Do something with the input
      System.out.println("Username is: " + userName);
      System.out.println("Opp: " + Opp.getName() + " (" + Opp.getHP() + "/" + Opp.getmaxHP() + ")");
    }
}
