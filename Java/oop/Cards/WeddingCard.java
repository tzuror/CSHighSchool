package oop.Cards;

public class WeddingCard extends GreetingCard {
    public WeddingCard(String bride, String groom, String sender){
        super(sender, bride+" & "+groom);
    }
    public void setRecipient(String bride, String groom){
        super.setRecipient(bride+" & "+groom);
    }
    protected String greetingMsg(){
        return "May you live happily ever after";
    }

    
}
