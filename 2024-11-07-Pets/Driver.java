/*  STEP 8
Overriding the getName() method changed the name to "The Mighty " + getName(). This shows that methods that are overridden use a new version of the method from the superclass.
STEP 10
Test 3 doesn't work because Bird is a subclass of Animal so Bird is-A Animal, but Animal isn't a Bird.
*/

public class Driver{
  public static void main(String[] args) {
    Animal a = new Animal("helloo", 20, "Bob");
    a.speak();
    Bird b = new Bird("helloo", 20, "Bob", 10.0, "blue");
    b.speak();

    Animal a1 = new Animal("woof", 5, "Peggy"); 
    Bird b1 = new Bird("meow" , 14, "Michael", 12.5, "red");
    //Bird b2 = new Animal("moooo", 15, "Megan");
    Animal a2 = new Bird("oink", 16, "Ted", 100.0, "orange");

    System.out.println("a1: ");
    a1.speak();
    System.out.println("b1: ");   
    b1.speak();
    System.out.println("a2: ");
    a2.speak();
  }
}