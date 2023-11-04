package oop;
public class test {

    public static void main(String[] args) {
    Point y = new Point(30,40);
    Rectangle r1 = new Rectangle(y , new Point (80,90));
    Rectangle r2 = new Rectangle(y,10,20);
    System.out.println(r1);
    System.out.println(r2.getArea()+ "the erae");
    System.out.println(r2);
    System.out.println(r2.getArea()+ "the erae");
    r1.move(100, 100);
    System.out.println();
    System.out.println(r1);
    System.out.println(r2);
    }
}
