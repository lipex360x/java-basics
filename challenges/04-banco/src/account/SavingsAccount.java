package account;

import client.Client;

public class SavingsAccount extends Account {
  
  public SavingsAccount(Client client) {
    super(client);
  }

  @Override
  public void printStatement() {
    super.printAccountData("Savings");
  }
}
