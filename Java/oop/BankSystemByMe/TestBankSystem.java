package oop.BankSystemByMe;

public class TestBankSystem {
    public static void main(String[] args) {
        Bank Hapoalim = israelBank.createBank();
        System.out.println(Hapoalim);
        BankAccount yo = israelBank.createAccount("Yossi", 1);
        System.out.println(yo);
        System.out.println(israelBank.getBankById(1));
    }
}
