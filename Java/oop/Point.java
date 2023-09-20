
package Java.oop;

public class Point {
    
    private double x,y;
    private int Id;
    private static int Id_counter = 0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
        this.Id = Id_counter;
        Id_counter++;

    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y = y;
    }
    public int getId(){
        return this.Id;
    }
    public double distance(Point p){
        return Math.sqrt((this.x - p.getX())*(this.x - p.getX())+(this.y - p.getY())*(this.y - p.getY()));
    }
    static Point middlePoint(Point p1, Point p2){
        double middlePointX = (p1.getX() + p2.getX())/2.0;
        double middlePointY = (p1.getY() + p2.getY())/2.0;
        return new Point(middlePointX, middlePointY);
    }

    public Point middle(Point p){
        double middlePointX = (this.x + p.getX())/2;
        double middlePointY = (this.y + p.getY())/2;
        return new Point(middlePointX, middlePointY);
    }

    public String toString(){
        return "(" + this.x  + ", " + this.y + ")";
    }

    


}

