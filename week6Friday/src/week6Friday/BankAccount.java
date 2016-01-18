package week6Friday;
import java.util.ArrayDeque;

public class BankAccount {
 
    private String firstName;
    private String lastName;
    private int age;
    private int uniqueNumber;
    private double balance;
    private double simpleInterest;
    private double complexInterest;
    private ArrayDeque<Double> history = new ArrayDeque<>();
 
    public BankAccount(String firstName, String lastName, int age, int uniqueNumber, double balance,
            double simpleInterest, double complexInterest) {
        init(firstName, lastName, age, uniqueNumber, balance, simpleInterest, complexInterest);
    }
 
    private void init(String firstName, String lastName, int age, int uniqueNumber, double balance,
            double simpleInterest, double complexInterest) {
        if (firstName.matches("\\W") || lastName.matches("\\W")) {
            throw new IllegalArgumentException();
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        if (age <= 18) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
        this.uniqueNumber = uniqueNumber;
        if (balance < 5) {
            throw new IllegalArgumentException();
        } else {
            this.balance = balance;
        }
        this.simpleInterest = simpleInterest;
        this.complexInterest = complexInterest;
    }
 
    public void addMoney(double moneyToAdd) {
        if (moneyToAdd < 0) {
            throw new IllegalArgumentException();
        } else {
            if(history.size() == 5){
                history.remove();
            }
            this.balance += moneyToAdd;
            this.history.add(moneyToAdd);
        }
    }
 
    public void withdraw(double withdraw) {
        if (this.complexInterest > 0.01) {
            throw new NotAllowedOperationException();
        }
        if (this.balance == 5) {
            throw new NoMoneyException();
        }
        if (balance - withdraw < 5 || withdraw < 0) {
            throw new IllegalArgumentException();
        } else {
            if(history.size() == 5){
                history.remove();
            }
            this.balance -= withdraw;
            this.history.add(-withdraw);
        }
    }
 
    public void transfer(BankAccount otherAccount, double money) {
        if (otherAccount == null) {
            throw new IllegalArgumentException();
        }
        if (this.complexInterest > 0.01) {
            throw new NotAllowedOperationException();
        }
        if (this.balance - money <= 5) {
            throw new NoMoneyException();
        }
        if(money < 0){
            throw new IllegalArgumentException();
        }
        otherAccount.addMoney(money);
        this.withdraw(money);
        this.history.add(-money);
        otherAccount.history.add(money);
    }
    public void printHistory(){
        for(double item : history){
            System.out.print(item + " ");
        }
    }
}