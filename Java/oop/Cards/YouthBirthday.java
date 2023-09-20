package oop.Cards;

public class YouthBirthday extends BirthdayCard {

    public YouthBirthday(String recipient, String sender, int age){
        super(sender, recipient, age);
    }
    protected String greetingMsg(){
        return super.greetingMsg() + "\nHow you have grown!!";
    }

}
