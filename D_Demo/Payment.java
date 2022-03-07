package D_Demo;

public class Payment
{
    private paymentApps medium;

    public void doTransaction(long amount)
    {
        medium.doPayment(amount);
    }

    public static void main(String args[])
    {
        paymentApps payment = new Paytm();
        payment.doPayment(5000);
    }
}
