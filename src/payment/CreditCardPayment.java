package payment;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String CardNumber, String cardHolderName) {
        this.cardNumber = CardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        String[] temp = getPaymentDetails().split(" ");
        System.out.println("User: '" + temp[0] + "' With card number: '"+ temp[1] + "' has paid with " + temp[2]);
        System.out.println(amount + "$ has been payed.");
    }
    @Override
    public String getPaymentDetails() {
        return cardHolderName + " " + cardNumber + " CreditCard";
    }
}
