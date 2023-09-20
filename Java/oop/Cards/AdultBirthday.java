package oop.Cards;

public class AdultBirthday extends BirthdayCard {
    public AdultBirthday(String recipient, String sender, int age){
        super(sender, recipient, age);
    }
    protected String greetingMsg(){
        return super.greetingMsg() + "\nYou haven't changed at all!";
    }
}
