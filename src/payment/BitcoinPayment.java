package payment;

public class BitcoinPayment implements PaymentStrategy{
    String wallet;

    public BitcoinPayment(String wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(double amount) {
        String[] temp = getPaymentDetails().split(" ");
        System.out.println("User: '" + temp[0] + "' has paid with " + temp[1]);
        System.out.println(amount + "$ has been payed");
    }
    @Override
    public String getPaymentDetails(){
        return wallet + " Bitcoins";
    }

}
//wallet and bitcoin should be pointed
/* wallet + bitcoin
A transaction was made in user wallet paying bitcoin
User wallet has paid with bitcoin
*
*
*
*  */