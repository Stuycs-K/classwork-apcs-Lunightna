import java.util.Scanner;
public class Game{
    public static void main(String[] args) {
      Adventurer Opp = new CodeWarrior("EvilCoder", 20);
      //do this once
      Scanner userInput = new Scanner(System.in);
      //You can do the rest many times:
      System.out.println("Enter username: ");
      //Read one line of user input
      String userName = userInput.nextLine();
      Adventurer You = new Archer(userName, 20);
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
        sleep(1000);
      while(fight.equals("y")){
        System.out.println("What would you like to do?");
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        String type = userInput.nextLine();
        while(!type.equals("a") && !type.equals("sp") && !type.equals("su") && !type.equals("quit")){
          System.out.println("Please type a valid action: a, sp, su, or quit");
          type = userInput.nextLine();
        }
        if(type.equals("a")){
          sleep(1500);
          System.out.println("You chose to attack");
          System.out.println(You.attack(Opp));
        }
        if(type.equals("sp")){
          sleep(1500);
          System.out.println("You chose to use specialAttack");
          System.out.println(You.specialAttack(Opp));
        }
        if(type.equals("su")){
          sleep(1500);
          System.out.println("You chose to support yourself");
          System.out.println(You.support());
        }
        if(type.equals("quit")){
          sleep(1500);
          System.out.println("Good bye");
          break;
        }

        sleep(1500);
        System.out.println("Stats: You: " + You.getHP() + "/" + You.getmaxHP());
        System.out.println("Opp: " + Opp.getHP() + "/" + Opp.getmaxHP());

        if(Opp.getHP()<=0){
          System.out.println("Congrats! You beat your biggest Opp");
        }
        if(You.getHP()<=0){
          System.out.println("womp womp. You lost against your Opp. -10000 aura");
        }
        sleep(1500);
        int OppT = (int)(Math.random() *3);
        if(OppT == 0){
          System.out.println(Opp.attack(You));
        }
        if(OppT == 1){
          System.out.println(Opp.specialAttack(You));
        }
        if(OppT == 2){
          System.out.println(Opp.support(You));
        }
        sleep(1500);
        System.out.println("Stats: You: " + You.getHP() + "/" + You.getmaxHP());
        System.out.println("Opp: " + Opp.getHP() + "/" + Opp.getmaxHP());
        sleep(1500);

        if(Opp.getHP()<=0){
          System.out.println("Congrats! You beat your biggest Opp");
          break;
        }
        if(You.getHP()<=0){
          System.out.println("womp womp. You lost against your Opp. -10000 aura");
          break;
        }
      }
      
    }
    public static void sleep(int milli){
      try{
        Thread.sleep(milli);
      }
      catch(Exception e){}
    }
}
