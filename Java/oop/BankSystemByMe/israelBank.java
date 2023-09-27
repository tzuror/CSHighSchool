package oop.BankSystemByMe;
import java.util.ArrayList;
import java.util.List;
public class israelBank {
    public static List<Bank> BanksList = new ArrayList<Bank>();
    
    public static void addBank(Bank bank){
        BanksList.add(bank);
    }
    public static void removeBank(Bank bank){
        BanksList.remove(bank);
    }
    public static int getBankId(Bank bank){
        return BanksList.indexOf(bank)+1;
    }
    public static Bank getBankById(int id){
        return BanksList.get(id-1);
    }
    public static void TransferMoney(int BankIdFrom, int AccountIdFrom, int BankIdTo, int AccountIdTo, double amount){
        BankAccount accountFrom = getBankById(BankIdFrom).getAccountById(AccountIdFrom);
        BankAccount accountTo = getBankById(BankIdTo).getAccountById(AccountIdTo);
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }
    public static Bank createBank(){
        Bank bank = new Bank();
        BanksList.add(bank);
        bank.setBankId(getBankId(bank));
        return bank;
    }
    public static BankAccount createAccount(String Name, int BankId){
        BankAccount account = new BankAccount(Name);
        getBankById(BankId).addAccount(account);
        account.setBankId(BankId);
        account.setAccountNumber(getBankById(BankId).GetIdOfAccount(account));
        account.setYourBank(getBankById(BankId));
        return account;
    }
    public static void main(String[] args) {
        Bank Hapoalim = israelBank.createBank();
        System.out.println(Hapoalim);
        
    }
}
