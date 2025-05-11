// Write your code here
public  abstract class Blanket{
    protected String size;
    protected String color;
    protected String material;
    protected double price;

    public Blanket(){
        size = "twin";
        color = "white";
        material = "cotton";
        price = 30.00;
    }

    public String getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public String getMaterial(){
        return material;
    }
    public double getPrice(){
        return price;
    }

    public void setSize(String sz){
        size = sz;
        if (size.equals("DOUBLE")){
            price = price + 10;
        }
        else if (size.equals("QUEEN")){
            price = price + 25;
        }
        else if (size.equals("KING")){
            price = price + 40;
        }
        
        
    }
    public void setColor(String cl){
        color = cl;
    }
    public void setMaterial(String  mt){
        material = mt.toUpperCase();
        if (material.equals("WOOL")){
            price = price + 20;
        }
        else if (material.equals("CASHMERE")){
            price = price + 45;
        }
        
        
    }
    



    public  abstract void toString();
    

}
    
