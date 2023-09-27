package oop.GeoShapes;

public  abstract class BasicShape {
    protected String color;
    public BasicShape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}
