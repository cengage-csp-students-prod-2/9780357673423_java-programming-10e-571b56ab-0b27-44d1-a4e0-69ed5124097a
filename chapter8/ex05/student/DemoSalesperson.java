// Write your code here

public class DemoSalesperson{
    public static void main(String[] args){
        for (int i = 0 ; i < 11 ; i ++){
            Salesperson sp = new Salesperson(9999, 0.0);

            

            System.out.println("Salesperson " + i + " has ID #" + sp.getId() + "and annual sales of $" + sp.getSales());

        }

}
}