package oop.GeoShapes;

import oop.Point;

public class Rectangle extends BasicShape {
    private Point bottomLeft;
    private Point topRight;
    public Rectangle(Point bottomLeft, Point topRight) {
        super("Red");
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
    public Rectangle(Point bottomLeft, int width, int height) {
        super("Red");
        this.bottomLeft = bottomLeft;
        this.topRight = new Point(bottomLeft.getX() + width, bottomLeft.getY() + height);
    }
    public double getArea(){
        return ((topRight.getX() - bottomLeft.getX()) * (topRight.getY() - bottomLeft.getY()));
    }
    public double getPerimeter(){
        return (2 * (topRight.getX() - bottomLeft.getX()) + 2 * (topRight.getY() - bottomLeft.getY()));
    }
    public void move(double dx, double dy){
        bottomLeft.move(dx, dy);
        topRight.move(dx, dy);
    }
    public String toString(){
        return "The Rectangle: \nPoint bottom-left:\n" + bottomLeft + "\nPoint top-right:\n" + topRight + "\nColor:\n " + color ;
    }
    
}
