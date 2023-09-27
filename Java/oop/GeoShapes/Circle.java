package oop.GeoShapes;

import oop.Point;
public class Circle extends BasicShape {
    protected Point center;
    protected double radius;

    public Circle(Point center, double radius, String color) {
        super(color);
        this.center = center;
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "The Circle: \nThe center of the circle: " + center + "\nThe radius: " + radius + "\nThe color: " + color ;
    }
}
