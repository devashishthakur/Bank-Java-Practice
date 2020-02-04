public interface PaymentGateway
{
    public abstract void pay(String from, String to, double amount, String comments);

    public abstract void acceptPayment(String from,String to, double amount);
}