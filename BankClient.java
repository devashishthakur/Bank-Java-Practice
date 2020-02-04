import java.util.Scanner;

/**
 * @author Devashish Thakur
 * @version 1.0
 * @since 1.0
 */

public class BankClient {
    public static void main(String[] args) {
        // Asking User for Inputs
        Scanner input = new Scanner(System.in);

        // Account Creation

        while (true) {
            System.out.println("Welcome to our Bank, Let's create an account for you\n\nPlease enter your name");
            String userName = input.next();

            System.out.println("Awesome, what is the initial amount you wanna start with ? ");
            double initialAmount = (double) input.nextDouble();

            // Passing Default Address
            Address address = new Address("JW 2", "Road No 4", "Bhagalpur", 812005);

            // SALARIED ACCOUNT BY DEFAULT

            Bank bank = new Bank(userName, initialAmount, address, AccountType.SALARIED_ACCOUNT);

            while (true) {

                // Message

                System.out.println("Welcome " + bank.name
                        + " what action you want to perform\n1. Add Amount\n2.Withdraw Amount\n3.Check Balance\n4. Show Address");

                // Menu Actions

                int userInput = input.nextInt();
                if (userInput == 1) {

                    System.out.println("What amount whould you like to add ? >> ");
                    double amountToAdd = input.nextDouble();
                    bank.addMoney(amountToAdd);
                    System.out.println("Amount Added\n");

                } else if (userInput == 2) {

                    System.out.println("What amount whould you like to withdraw ? >> ");
                    double amountToWithdraw = input.nextDouble();
                    bank.withdrawMoney(amountToWithdraw);

                } else if (userInput == 3) {

                    System.out.println("Your balance is " + bank.checkBalance());

                } else if (userInput == 4) {

                    bank.showAddress();

                } else {

                    System.out.println("Please enter 1,2 or 3");

                }

                System.out.println("Enter 1 to Continue, 0 to Exit");

                // Checking if User Wants to Continue

                int inputExit = input.nextInt();
                if (inputExit == 0) {
                    break;
                }

            }
            input.close();
        }
    }
}