
public class Account {

  // class variables
  String accountName;
  int accountNum;
  int balance;

  //default constructor for Account
  Account() {
    this.accountName = "EMPTY";
    this.accountNum = 0;
    this.balance = 0;
  }

  //overloaded constructor for Account
  Account(String name, int num, int amt) {
    accountName = name;
    accountNum = num;
    balance = amt;
  }

  //make a deposit to the balance
  public void deposit(int amt) {
    balance = balance + amt;
  }

  //make a withdrawal from the balance
  public void withdraw(int amt) {
    balance = balance - amt;
  }

  //modifier to set the accountname
  public void setAccountName(String name) {
    accountName = name;
  }

  //modifier to set the accountnumber
  public void setAccountNum(int num) {
    accountNum = num;
  }

  //modifier to set the balance
  public void setBalance(int num) {
    balance = num;
  }

  //accessor to get the accountname
  public String getaccountname() {

    return accountName;
  }

  //accessor to get the accountnumber
  public int getaccountnum() {

    return accountNum;
  }

  //accessor to get the account balance
  public int getbalance() {

    return balance;
  }

  //print method
  public void print() {
    System.out.println(accountName + " " + accountNum + " " + balance);
  }
}
