package D_Demo;


public class Payment_Without_D
{
    private Paytm_Without_D paytm;

    public void doTransaction(long amount)
    {
        paytm.doPayment(amount);
    }

    public static void main(String args[])
    {
        Payment_Without_D paymentapp = new Payment_Without_D();
        paymentapp.doTransaction(5000);
    }
}
