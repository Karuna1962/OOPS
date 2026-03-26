
class InvoiceProcessor
{
    public void generateInvoice(String customer, double amount)
    {
        System.out.println("Customer: " + customer);
        System.out.println("Amount: " + amount);
        internalCalculation(amount);
    }

    private void internalCalculation(double amount)
    {
        System.out.println("Tax calculated internally on " + amount);
    }

    public void accessInternal(double amount)
    {
        internalCalculation(amount);
    }
}

class RetailInvoice extends InvoiceProcessor
{
    public void generateInvoice(String customer, double amount)
    {
        double discount = amount * 0.10;
        double finalAmount = amount - discount;
        System.out.println("Retail Customer: " + customer);
        System.out.println("Amount after discount: " + finalAmount);
    }
}

public class Main2
{
    public static void main(String[] args)
    {
        InvoiceProcessor obj = new RetailInvoice();
        obj.generateInvoice("Rahul", 5000);
        obj.accessInternal(5000);
    }
}
