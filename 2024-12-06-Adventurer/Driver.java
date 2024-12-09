public class Driver{
  public static void main(String[] args) {
    Adventurer p1 = new Archer("Night", 100);
    Adventurer p2 = new Archer("Day", 100);
    int round = 1;

    System.out.println(p1.getName() + " VS. " + p2.getName());
    System.out.println("Round " + round);
    System.out.println(p1.attack(p2));
    System.out.println(p2.specialAttack(p1));
    System.out.println(p1.getName() + " hp: " + p1.getHP() + "; " + p2.getName() + " hp: " + p2.getHP());
    System.out.println(p1.getName() + " arrowCount: " + ((Archer) p1).getArrow() + "; " + p2.getName() + " arrowCount: " + (((Archer)p2).getArrow()));
    round++;
    System.out.println("Round " + round);
    System.out.println(p1.support());
    System.out.println(p2.support());
    System.out.println(p1.getName() + " hp: " + p1.getHP() + "; " + p2.getName() + " hp: " + p2.getHP());

  }
}
