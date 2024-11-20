package bank;

import java.util.List;

import account.Account;

abstract class Bank {
  protected String name;
  protected List<Account> acounts;

  public List<Account> getAcounts() {
    return this.acounts;
  }

  public void setAcounts(List<Account> acounts) {
    this.acounts = acounts;
  }

  abstract String getName();
}
