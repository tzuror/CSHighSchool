package oop.Cards;

public class BirthdayCard extends GreetingCard {
    private int age;
    public BirthdayCard(String sender, String recipient, int age) {
        super(sender, recipient);
        this.age = age;
    }
    protected String greetingMsg(){
        return "Happy " + this.age + "th Birthday!";
    }
    
}
