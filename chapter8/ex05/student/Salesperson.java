// Write your code here
public class Salesperson{
    int id ;
    double sales;

    public Salesperson(){
        this.id = 0;
        this.sales = 0;
    }

    public Salesperson(int id, double sales){
        setId(id);
        setSales(sales);
    }

    public int getId(){
        return this.id;
    }

    public double getSales(){
        return this.sales;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setSales(double sales){
        this.sales = sales;
    }
    
} 