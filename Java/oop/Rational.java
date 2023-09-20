package oop;

public class Rational {
    private int numerator, denominator;
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenom(){
        return this.denominator;
    }
    public boolean isEquals(Rational num){
        if(this.numerator*num.denominator == this.denominator*num.numerator){
            return true;
        }
        return false;
    }
    public Rational multiply(Rational num){
        return new Rational(this.numerator*num.numerator, this.denominator*num.denominator);
    }
    public Rational divide(Rational num){
        if(num.numerator == 0){
            return null;
        }
        return new Rational(this.numerator * num.denominator, this.denominator*num.numerator);
    }
    public String toString(){
        return this.numerator+"/"+this.denominator;
    }
    
}
