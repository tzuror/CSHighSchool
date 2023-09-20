package oop;
import java.util.Vector;
//import java.util.Point
public class test {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(new Point(1, 2));
        v.add(new Point(3, 4));
        v.add(new Point(5, 6));
        v.add(2);
        System.out.println(v.get(0));
        
        
    }
}
