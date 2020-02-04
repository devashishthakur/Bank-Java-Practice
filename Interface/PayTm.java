class PayTm implements PaymentGateway

{

    @Override
    public void pay(String from, String to, double amount, String comments) {
        System.out.println("Paid "+amount+ " from " + from + " to " + to + "\ncomments "+comments + " : using PayTm");
    }

    @Override
    public void acceptPayment(String from, String to, double amount) {
        System.out.println("Accepting "+amount+ " from " + from + " to " + to + " : using Paytm");

    }
    
}