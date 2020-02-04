/**
 * @author Devashish Thakur
 * @version 1.0
 * @since 1.0
 */

public class Bank
{
    private double balance = 10000;
    String name;
    Address address;
    AccountType accountType;
    private long accountID;
    private static long INITIAL_ACCOUNT_ID_VALUE = 10000;

    //Creating Account (Constructor)
    Bank(String name, double balance, Address address, AccountType accountType)
    {
        switch(accountType)
        {
            case SALARIED_ACCOUNT:
                this.balance = balance;
                break;
            
            default:
                if(balance > 10000)
                    this.balance = balance;
                else
                    System.out.println("Please Deposit minimum 10k ");

        }
        
        this.name = name;

        this.address = address;

        this.accountType = accountType;

        //UPDATING ACCOUNT ID

        this.accountID = INITIAL_ACCOUNT_ID_VALUE++;
    }

    Bank(String name, Address address, AccountType accountType)
    {
        this.address = address;
        this.name = name;
        this.accountType = accountType;

        //UPDATING ACCOUNT ID

        this.accountID = INITIAL_ACCOUNT_ID_VALUE++;
    }

    void addMoney(double amount)
    {
        balance = balance + amount;
    }

    double checkBalance() {
        return balance;
    }

     void withdrawMoney(double amount)
    {

        //Checking if account balance is more than 10k

        if (amount < checkBalance() - 10000) {
            System.out.println("Amount Withdrawn");
            balance = balance - amount;
        } else {
            System.out.println("You don't have enough money");
        }
    }

    void showAddress()
    {
        System.out.println(address.getStreet() + " " + address.getHouseNo() + "  " + address.getCity() + "  " + address.getZipCode());
    }

    AccountType getAccountType()
    {
        return accountType;
    }
}