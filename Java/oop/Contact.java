package oop;

public class Contact {
    private String Name;
    private String Phone;
    public Contact(String Name, String Phone){
        this.Name = Name;
        this.Phone = Phone;
    }
    public String getName(){
        return this.Name;
    }
    public String getPhone(){
        return this.Phone;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setPhone(String Phone){
        this.Phone = Phone;
    }
    public String toString(){
        return this.Name + ": " + this.Phone;
    }
}
