package account;

import client.Client;

public abstract class Account implements IAccount {
  private static final int AGENCY = 1;
  private static int SEQUENCE = 1;

  protected int agency;
  protected int accountNumber;
  protected double balance;
  protected Client client;
  
  public Account(Client client) {
    this.agency = AGENCY;
    this.accountNumber = SEQUENCE++;
    this.client = client;
  }

  public int getAgency() {
    return this.agency;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  @Override
  public void withdraw(double value) {
    this.balance -= value;
  }
  
  @Override
  public void deposit(double value) {
    this.balance += value;
  }

  @Override
  public void transfer(Account account, double value) {
    this.withdraw(value);
    account.deposit(value);
  }

  protected void printAccountData(String accountType) {
    System.out.println("-----------------------");
    System.out.println("    " + accountType + " Account");
    System.out.println("-----------------------");
    System.out.println(String.format("     Client: %s ", this.client.getName()));
    System.out.println(String.format("     Agency: %d ", this.agency));
    System.out.println(String.format("     Account: %d ",  this.accountNumber));
    System.out.println(String.format("     Balance: %.2f\n", this.balance));
  }
}