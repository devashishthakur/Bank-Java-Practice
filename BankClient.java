import java.util.Scanner;

public class BankClient {
    public static void main(String[] args) {
        // Asking User for Inputs
        Scanner input = new Scanner(System.in);

        // Account Creation

        System.out.println("Welcome to our Bank, Let's create an account for you\n\nPlease enter your name");
        String userName = input.next();

        System.out.println("Awesome, what is the initial amount you wanna start with ? ");
        int initialAmount = input.nextInt();

        Bank bank = new Bank(userName, initialAmount);

        while (true) {
            System.out.println("Welcome " + bank.name
                    + " what action you want to perform\n1. Add Amount\n2.Withdraw Amount\n3.Check Balance");
            int userInput = input.nextInt();
            if (userInput == 1) {
                System.out.println("What amount whould you like to add ? >> ");
                int amountToAdd = input.nextInt();
                bank.addMoney(amountToAdd);
                System.out.println("Amount Added\n");
            } else if (userInput == 2) {
                System.out.println("What amount whould you like to withdraw ? >> ");
                int amountToWithdraw = input.nextInt();
                if (amountToWithdraw < bank.checkBalance()) {
                    bank.withdrawMoney(amountToWithdraw);
                    System.out.println("Amount Withdrawn");
                } else {
                    System.out.println("You don't have enough money");
                }
            } else if (userInput == 3) {
                System.out.println("Your balance is " + bank.checkBalance());
            } else {
                System.out.println("Please enter 1,2 or 3");
            }

            /*
             * 
             * System.out.println("Do you wanna continue, Press 0 to exit 1 to continue");
             * 
             * int inputExit = input.nextInt();
             * 
             * if(inputExit == 0) { break; }
             */
        }
    }
}