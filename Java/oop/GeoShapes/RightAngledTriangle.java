package oop.GeoShapes;
import oop.Point;
public class RightAngledTriangle extends BasicShape {
    private Point RightAngledPoint;
    private double length1;
    private double length2;
    public RightAngledTriangle(Point RightAngledPoint, double length1, double length2) {
        super("Green");
        this.RightAngledPoint = RightAngledPoint;
        this.length1 = length1;
        this.length2 = length2;
    }
    public double getArea(){
        return (length1 * length2)/2;
    }
    public double getPerimeter(){
        return length1 + length2 + Math.sqrt(length1*length1 + length2*length2);
    }
    public void move(double dx, double dy){
        RightAngledPoint.move(dx, dy);
    }
    public String toString(){
        return "The RightAngledTriangle: \nPoint RightAngledPoint:\n" + RightAngledPoint + "\nLength1:\n" + length1 + "\nLength2:\n" + length2 + "\nColor:\n " + color ;
    }

}
