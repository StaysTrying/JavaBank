public abstract class AbstractBankAccount {

    public final String BANK = "JavaBank";
    // class variables
    String accountName;
    int accountNum;
    int balance;

    //overloaded constructor for Account
    AbstractBankAccount(String name, int num, int amt) {
        accountName = name;
        accountNum = num;
        balance = amt;
    }

    //make a deposit to the balance
    public void deposit(int amt) { balance = balance + amt; }

    //make a withdrawal from the balance
    public void withdraw(int amt) {
        balance = balance - amt;
    }

    public String getBankName() { return InterfaceBankAccount.BANK; }

    //modifier to set the accountName
    public void setAccountName(String name) {
        accountName = name;
    }

    //modifier to set the accountNumber
    public void setAccountNum(int num) {
        accountNum = num;
    }

    //modifier to set the balance
    public void setBalance(int num) {
        balance = num;
    }

    public int getBalance() { return balance; }

    //accessor to get the accountName
    public String getAccountName() { return accountName; }

    //accessor to get the accountNumber
    public int getAccountNum() { return accountNum; }

    @Override
    public String toString()
    {
        return "\n\nBank Name : " + getBankName() +
                "\nAccount Holder : " + accountName +
                "\nAccount Number : " + accountNum +
                "\nAccount balance: " + balance;
    }//end method toString

}//end class AbstractBankAccount