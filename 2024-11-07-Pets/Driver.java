public class Driver{
  public static void main(String[] args) {
    Animal a = new Animal("helloo", 20, "bob");
    a.speak();
    Bird b = new Bird("helloo", 20, "bob", 10.0, "blue");
    b.speak();
  }
}
