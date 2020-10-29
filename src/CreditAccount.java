
public class CreditAccount extends AbstractBankAccount {

    private int creditLimit;

    //default constructor for CreditAccount
    CreditAccount(String name, int num, int amt)
    {
        super(name,num,amt);
        this.creditLimit=calculateCreditLimit(amt);
    }//end constructor method

    CreditAccount(String name, int num, int amt, int credit)
    {
        super(name,num,amt);
        this.creditLimit= credit;
    }//end constructor method

    //modifier to set the account creditLimit
    public void setCreditLimit(int num) {
        creditLimit = num;
    }

    //accessor to get the account creditLimit
    public int getCreditLimit() {

        return creditLimit;
    }

    private static int calculateCreditLimit(int amt) {
        if(amt>1 && amt<=2000)
            return 100;
        else if(amt<=4000)
            return 200;
        else
            return 300;
//endif
    }//end method calculateCreditLimit

    //print method
    public void print()
    {
        System.out.println("\nBank Name : " + getBankName() +
                "\nAccount Holder : " + accountName +
                "\nAccount Number : " + accountNum +
                "\nAccount balance: " + balance +
                "\nCredit Limit : " + creditLimit);
    }//end method print

    @Override
    public void deposit(int amt) {
        balance=balance+amt;
    }//end method deposit

    @Override
    public String toString() {
        return super.toString() +
                "\nCredit Limit : " + creditLimit;
    }//end method toString

}//end class CreditAccount

