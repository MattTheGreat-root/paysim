package payment;

import java.util.ArrayList;

public abstract class Customer {
    public String name;
    //initialized inside the constructor
    public ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();
    //transaction was made...
    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String[] temp = paymentStrategy.getPaymentDetails().split(" ");

        paymentHistory.add("A transaction of " + amount + "$ has been made by " + temp[0] );
    }

    public void showPaymentHistory() {
        for (String details : paymentHistory) {
            System.out.println(details);
        }
    }
}
