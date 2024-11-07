// Overriding the getName() method changed the name to "The Mighty " + getName().

public class Driver{
  public static void main(String[] args) {
    Animal a = new Animal("helloo", 20, "Bob");
    a.speak();
    Bird b = new Bird("helloo", 20, "Bob", 10.0, "blue");
    b.speak();
  }
}
