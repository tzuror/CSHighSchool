package oop;
import java.util.Vector;
//import java.util.Point
public class test {

    public static void main(String[] args) {
        Object[] o = new Object[3];
        o[0] = new Point(1, 2);
        o[1] = 3;
        o[2] = "my";
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }
        
    }
}
