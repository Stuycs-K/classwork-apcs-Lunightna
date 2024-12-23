import java.lang.Math;
public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
      return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(-2,-5);
    Point p5 = new Point(0,6);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( p4);
    System.out.println( distance(p4,p5));
    System.out.println( Point.distance(p5,p4));
    System.out.println( p5.distanceTo(p4));
    Point a = new Point(0,0);
    Point b = new Point(1,0);
    Point c = new Point(0.5, Math.sqrt(0.75));
    System.out.println( distance(a,b));
    System.out.println( distance(a,c));
    System.out.println( distance(b,c));
  }
}
