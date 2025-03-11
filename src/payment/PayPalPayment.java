package payment;

public class PayPalPayment implements PaymentStrategy{
    public String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        String[] temp = getPaymentDetails().split(" ");
        System.out.println("User: '" + temp[0] + "' has paid with his/her" + temp[1] + " account.");
        System.out.println(amount + "$ has been payed");
    }
    @Override
    public String getPaymentDetails() {
        return email + " PayPal";
    }
}
