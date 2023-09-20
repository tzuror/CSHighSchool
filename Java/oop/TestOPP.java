package Java.oop;

public class TestOPP {
    public static void main(String[] args) {
        Bucket onw = new Bucket(20);
        System.out.println(onw.isEmpty());
        onw.empty();
        System.out.println(onw.isEmpty());
        Bucket two = new Bucket(0);
        System.out.println(two.isEmpty());
    }
}
