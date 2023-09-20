package Java.oop;

public class Bucket {
    private int capacity;
    private double AmountFilled = 0;

    public Bucket(int capacity){
        this.capacity = capacity;
    }
    public void empty(){
        this.AmountFilled = 0;
    }
    public boolean isEmpty(){
        return this.AmountFilled ==0;
    }
    public void fill(double AmountToFill){
        this.AmountFilled += AmountToFill;
        if( this.AmountFilled > this.capacity){
            this.AmountFilled = this.capacity;
        }
    }
    public int getCapacity(){
        return this.capacity;
    }
    public double getCurrentAmount(){
        return this.AmountFilled;
    }
    public void pourInto(Bucket bucketInto){
        bucketInto.fill(AmountFilled);
        this.empty();
    }
    public String toString(){
        return "The capacity: " + this.capacity + "\nThe current amount of water: " + this.AmountFilled;
    }
}
