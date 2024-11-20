import account.Account;
import account.CheckingAccount;
import account.SavingsAccount;
import client.Client;

public class Main {
  public static void main(String[] args) {
    Client costumer = new Client();
    costumer.setName("Felipe");
    Account savings = new SavingsAccount(costumer);
    savings.printStatement();
    savings.deposit(100);
    savings.printStatement();
    Account checking = new CheckingAccount(costumer);
    checking.printStatement();
    savings.transfer(checking, 50);
    savings.printStatement();
    checking.printStatement();
  }
}
