package oop.BankSystemByMe;

public class BankAccount {
    private String Name;
    private int AccountNumber, BankId;
    
    private Bank YourBank;
    private double AmountOfMoney = 0;

    public BankAccount(String Name){
        this.Name = Name;
    }
    public void deposit(double AmountToDeposit){
        this.AmountOfMoney += AmountToDeposit;
    }
    public void withdraw(double AmountToWithdraw){
        this.AmountOfMoney -= AmountToWithdraw;
    }
    public double getAmountOfMoney(){
        return this.AmountOfMoney;
    }
    public String getName(){
        return this.Name;
    }
    public int getAccountNumber(){
        return this.AccountNumber;
    }
    
    public int getBankId(){
        return this.BankId;
    }
    public void setBankId(int BankId){
        this.BankId = BankId;
    }
    public void setAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
    }
    public void setYourBank(Bank YourBank){
        this.YourBank = YourBank;
    }
    public void transferMoney(int BankIdTo, int AccountIdTo, double amount){
        israelBank.TransferMoney(this.BankId, this.AccountNumber, BankIdTo, AccountIdTo, amount);
    }

    public String toString(){
        return "Name: " + this.Name + "\nAccount number: " + this.AccountNumber + "\nBank: " + this.YourBank.getBankId() + "\nAmount of money: " + this.AmountOfMoney;
    }
    
}
