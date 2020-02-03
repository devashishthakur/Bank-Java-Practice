/**
 * @author Devashish Thakur
 * @version 1.0
 * @since 1.0
 */

public class Bank
{
    static int balance;
    String name;

    //Creating Account (Constructor)

    Bank(String name, int balance)
    {
        this.balance = balance;
        this.name = name;
    }

    void addMoney(int amount)
    {
        balance = balance + amount;
    }

     int checkBalance()
    {
        return balance;
    }

     void withdrawMoney(int amount)
    {
        balance = balance - amount;
    }
}