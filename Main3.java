class InvoiceProcessor {

    public void generateInvoice(String customerName, double amount) {
        double finalAmount = calculateFinalAmount(amount);
        System.out.println("Invoice for: " + customerName);
        System.out.println("Amount: " + finalAmount);
    }

    private double calculateFinalAmount(double amount) {
        System.out.println("Superclass calculation (no discount)");
        return amount;
    }
}

class RetailInvoice extends InvoiceProcessor {

    @Override
    public void generateInvoice(String customerName, double amount) {
        double discountedAmount = applyDiscount(amount);
        System.out.println("Retail Invoice for: " + customerName);
        System.out.println("Discounted Amount: " + discountedAmount);
    }

    public double applyDiscount(double amount) {
        System.out.println("Applying retail discount (10%)");
        return amount * 0.9;
    }

    private double calculateFinalAmount(double amount) {
        System.out.println("Subclass private method (not overriding)");
        return amount * 0.8;
    }
}

public class Main3 {
    public static void main(String[] args) {

        InvoiceProcessor processor = new RetailInvoice();
        processor.generateInvoice("Karuna", 1000);

        System.out.println("\n--- Direct superclass object ---");

        InvoiceProcessor baseProcessor = new InvoiceProcessor();
        baseProcessor.generateInvoice("Karuna", 1000);
    }
}