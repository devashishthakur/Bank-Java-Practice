public class PaymentGatewayClient {
    public static void main(String[] args) {
        PaymentGateway gateway;

        if (args[0].equals("1")) {
            gateway = new GooglePay();
            gateway.pay("Devashish", "Dev", 210202.30, "Enjoy");
        } else {
            gateway = new PayTm();
            gateway.pay("Devashish", "Dev", 210202.30, "Enjoy");
        }
    }
}