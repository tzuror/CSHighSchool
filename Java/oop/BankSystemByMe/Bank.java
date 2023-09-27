package oop.BankSystemByMe;
import java.util.ArrayList;
import java.util.List;
public class Bank {
    private List<BankAccount> BankAcountsList;
    private int BankId=-1;

    public Bank(){
        this.BankAcountsList = new ArrayList<BankAccount>();
        
    }
    public void addAccount(BankAccount account){
        this.BankAcountsList.add(account);
    }
    public void removeAccount(BankAccount account){
        this.BankAcountsList.remove(account);
    }
    public int GetIdOfAccount(BankAccount account){
        return this.BankAcountsList.indexOf(account)+1;
    }
    public BankAccount getAccountById(int id){
        return this.BankAcountsList.get(id-1);
    }
    public void setBankId(int BankId){
        this.BankId = BankId;
    }
    public int getBankId(){
        return this.BankId;
    }
    public String toString(){
        return "Bank id: " + this.BankId + "\nNumber of accounts: " + this.BankAcountsList.size();
    }



}
