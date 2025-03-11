import payment.*;

public class Main {
    static void printLine(){
        System.out.println("----------------------------------------");
    }
    public static void main(String[] args) {
        //what happens if we make it customer not prim
        PremiumCustomer premiumCustomer1 = new PremiumCustomer("Matt");
        RegularCustomer regularCustomer1 = new RegularCustomer("Jack");
        RegularCustomer regularCustomer2 = new RegularCustomer("Jane");
        //only made once so can you make it anonymous
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234", "Matt");
        PayPalPayment payPalPayment = new PayPalPayment("Jack@PayPal.com");
        BitcoinPayment bitcoinPayment = new BitcoinPayment("JaneBinance@124");

        premiumCustomer1.displayCustomerInfo();
        regularCustomer1.displayCustomerInfo();
        regularCustomer2.displayCustomerInfo();
        printLine();

        premiumCustomer1.makePayment(creditCardPayment, 220);
        regularCustomer1.makePayment(payPalPayment, 100);
        regularCustomer2.makePayment(bitcoinPayment, 80);
        premiumCustomer1.makePayment(creditCardPayment, 100);
        regularCustomer1.makePayment(payPalPayment, 50);
        regularCustomer2.makePayment(bitcoinPayment, 30);
        printLine();
        premiumCustomer1.showPaymentHistory();
        printLine();
        regularCustomer1.showPaymentHistory();
        printLine();
        regularCustomer2.showPaymentHistory();

    }
}