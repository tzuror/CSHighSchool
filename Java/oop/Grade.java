package oop;

public class Grade {
    private String subject;
    private int num;

    public Grade(String subject, int num) {
        this.subject = subject;
        this.num = num;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String toString(){
        return this.subject +": " + this.num;
    }
}
