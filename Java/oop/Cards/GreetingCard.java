package oop.Cards;

public class GreetingCard {
    private String recipient, sender;
    public GreetingCard(String sender, String recipient){
        this.sender = sender;
        this.recipient = recipient;
    }
    public void setRecipient(String recipient){
        this.recipient = recipient;
    }
    protected String greetingMsg(){
        return "Best Greetings!";
    }
    public String toString(){
        return "Dear " + this.recipient +",\n" + this.greetingMsg() + "\n" + this.sender + "\n******************";
    }
    
}
