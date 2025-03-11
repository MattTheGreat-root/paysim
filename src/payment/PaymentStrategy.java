package payment;

interface PaymentStrategy {
    public void pay(double amount);
    public String getPaymentDetails();
}
