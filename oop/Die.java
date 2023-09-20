package oop;

public class Die {
    private int value;
    public Die(){
        this.value = (int)(Math.random()*6 + 1);
    }
    public void roll(){
        this.value = (int)(Math.random()*6 + 1);
    }
    public int getNum(){
        return this.value;
    }
    
}
