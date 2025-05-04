// Write your code here
public class Purchase{
    private int invoiceNumber;
    private double saleAmount;
    private double tax;

    public void setSaleAmount(double sa){
        saleAmount = sa;
        tax = saleAmount + (0.05 * saleAmount);

    }
    public void setInvoiceNumber(int inVo){
        invoiceNumber = inVo;
    }

    public void display(){
        System.out.println("Invoice #" + invoiceNumber + " Amount of sale: $"+ saleAmount +"Tax: $"+ tax );
    }

    public int getInvoiceNumber(){
        return invoiceNumber;
    }
    public double getSaleAmount(){
        return saleAmount;
    }
    public double getTax(){
        return tax;
    }
}