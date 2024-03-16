import java.util.Scanner;
import point.Punkt;
public class Main {
    public static void main(String[] args) {
       Punkt p1 = new Punkt(1, 2);
       Punkt p2 = new Punkt(5, 8);
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p1.equals(p2));
       System.out.println(p1.getX());
       System.out.println(p1.getY());
       System.out.println(p2.toString());
       Punkt p3 = new Punkt(1, 2);
       System.out.println(p1.equals(p3));
       System.out.println(p1.hashCode());
       System.out.println(p3.hashCode());
    }
}