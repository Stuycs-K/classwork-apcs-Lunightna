import java.util.Scanner;
public class Game{
    public static void main(String[] args) {
      Adventurer Opp = new CodeWarrior("EvilCoder", 100);
      Adventurer You = new Archer("Night", 100);
      //do this once
      Scanner userInput = new Scanner(System.in);
      //You can do the rest many times:
      System.out.println("Enter username: ");
      //Read one line of user input
      String userName = userInput.nextLine();
      //Do something with the input
      System.out.println("You: " + userName + " --- Your hp: " + You.getHP() + "/" + You.getmaxHP());
      System.out.println("Opp: " + Opp.getName() + " (" + Opp.getHP() + "/" + Opp.getmaxHP() + ")");
      
      System.out.println("Are you ready to fight? (y/n)");
      String fight = userInput.nextLine();
      while(!fight.equals("y")&&!fight.equals("n")){
        System.out.println("Please type only y or n");
        if(fight.equals("only y or n")){ //easter egg
          System.out.println("do you think you're funny? y or n");
        }
        fight = userInput.nextLine();
        }
      }
}