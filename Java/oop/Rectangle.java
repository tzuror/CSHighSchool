package oop;

public class Rectangle {
    private Point bottomLeft;
    private double height, width;
    public Rectangle(Point bottomLeft, Point topRight){
        this.bottomLeft = bottomLeft;
        this.width = topRight.getX() - bottomLeft.getX();
        this.height = topRight.getY() - bottomLeft.getY();
    }
    public Rectangle(Point bottomLeft, double width, double height){
        this.bottomLeft = bottomLeft;
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimiter(){
        return this.height*2+this.width*2;
    }
    public void move(double deltaX, double deltaY){
        this.bottomLeft.setX(this.bottomLeft.getX()+deltaX);
        this.bottomLeft.setY(this.bottomLeft.getY()+deltaY);
    }
    public String toString(){
        double trX = this.bottomLeft.getX()+ width;
        double trY = this.bottomLeft.getY() + height;
        return "Rectangle: \nbottom-left point = (" + this.bottomLeft.getX() + ", " + this.bottomLeft.getY() +") \ntop-right point = (" +trX+", "+trY+")";
    }
}
