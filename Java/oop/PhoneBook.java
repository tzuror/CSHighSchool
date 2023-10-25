package oop;

public class PhoneBook {
    private Contact[] contacts;
    public PhoneBook(int numContacts ){
        this.contacts = new Contact[numContacts];
    }
    public void addContact(String name, String phone){
        int firstnull = -1;
        for(int i = 0; i < this.contacts.length; i++ ){
            if(this.contacts[i] != null){
                if(this.contacts[i].getName().equals(name)){
                    this.contacts[i].setPhone(phone);
                    return;
                }
            }else{
                if (firstnull == -1){
                    firstnull = i;
                }
            }
        }
        if(firstnull !=-1){
            this.contacts[firstnull] = new Contact(name, phone);
        }

    }
    public void delContact(String name){
        for(int i = 0; i < this.contacts.length; i++ ){
            if(this.contacts[i] != null){
                if(this.contacts[i].getName().equals(name)){
                    this.contacts[i] = null;
                }
            }
        }
    }
    public String getPhone(String name){
        for(int i = 0; i < this.contacts.length; i++ ){
            if(this.contacts[i] != null){
                if(this.contacts[i].getName().equals(name)){
                    return this.contacts[i].getPhone();
                }
            }
        }
        return null;
    }
    public String[] getAllContactsNames(){
        int numContacts = 0;
        for(int i = 0; i < this.contacts.length; i++ ){
            if(this.contacts[i] != null){
                numContacts++;
            }
        }
        String[] names = new String[numContacts];
        int counter = 0;
        for(int i = 0; i < this.contacts.length; i++ ){
            if(this.contacts[i] != null){
                names[counter] = this.contacts[i].getName();
                counter++;
            }
        }
        return names;
    }
    public String toString(){
        String[] names = this.getAllContactsNames();
        for(int i = 0; i<names.length -1 ; i++){
            for (int j = i+1; j<names.length; j++){
                if(names[i].compareTo(names[j])>0){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        String str = "";
        for(int i = 0; i<names.length; i++ ){
            str += names[i] + " " + this.getPhone(names[i]) + "\n";
        }
        return str;
    }
}
