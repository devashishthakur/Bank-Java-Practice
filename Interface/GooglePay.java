public class GooglePay implements PaymentGateway
{

    @Override
    public void pay(String from, String to, double amount, String comments) {
        System.out.println("Paid "+amount+ " from " + from + " to " + to + "\ncomments "+comments + " : using GooglePay");
    }

    @Override
    public void acceptPayment(String from, String to, double amount) {
        System.out.println("Accepting "+amount+ " from " + from + " to " + to + " : using G Pay");

    }
    
}