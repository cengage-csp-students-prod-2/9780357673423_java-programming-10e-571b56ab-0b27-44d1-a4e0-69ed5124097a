// Write your code here

// Write your code here

public class DemoSalesperson2{
    public static void main(String[] args){
        for (int i = 0 ; i < 10 ; i ++){
            Salesperson sp = new Salesperson(111 + i, 25000 + i * 5000);

            

            System.out.println("Salesperson " + i + " has ID #" + sp.getId() + "and annual sales of $" + sp.getSales());

        }

}
}