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
		if (firstName.matches("\\W")) {.
			throw new IllegalArgumentException("Invalid first name.");
		} else if (lastName.matches("\\W")) {
			throw new IllegalArgumentException("Invalid last name.");
		} else {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		if (age <= 18) {
			throw new IllegalArgumentException("Invalid age.");
		} else {
			this.age = age;
		}
		this.uniqueNumber = uniqueNumber;
		if (balance < 0) {
			throw new IllegalArgumentException("Balance should be positive.");
		} else {
			this.balance = balance;
		}
		this.simpleInterest = simpleInterest;
		this.complexInterest = complexInterest;
	}

	public void addMoney(double moneyToAdd) {
		if (moneyToAdd < 0) {
			throw new IllegalArgumentException("You cannot add negative amount into your account.");
		} else {
			if (history.size() == 5) {
				history.remove();
			}
			this.balance += moneyToAdd;
			this.history.add(moneyToAdd);
		}
	}

	public void withdraw(double withdraw) {
		if (this.complexInterest > 0.01) {
			throw new NotAllowedOperationException("You cannot withdraw when the interest is more than 1%.");
		}
		if (this.balance < withdraw) {
			throw new NoMoneyException("There are not enough money to withdraw.");
		} else {
			if (history.size() == 5) {
				history.remove();
			}
			this.balance -= withdraw;
			this.history.add(-withdraw);
		}

	}

	public void transfer(BankAccount otherAccount, double money) {
		if (otherAccount == null) {
			throw new IllegalArgumentException("Account to transfer is not initialized");
		}
		try {
			this.withdraw(money);
		} catch (NoMoneyException e) {
			throw NoMoneyException(e.toString() + " Transfer failed.");
		} catch (NotAllowedOperationException e) {
			throw NotAllowedOperationException(e.toString() + " Transfer failed.");
		}
		
		try {
			otherAccount.addMoney(money);
		} catch (NotAllowedOperationException e) {
			this.addMoney(money);
			throw NotAllowedOperationException(e.toString() + " Transfer failed.");
		}
	}

	public void printHistory() {
		for (double item : history) {
			System.out.print(item + " ");
		}
	}
}