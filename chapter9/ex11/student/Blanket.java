// Write your code here
public   class Blanket{
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

    public void setSize(String sz) {
    sz = sz.toLowerCase();
    switch(sz) {
        case "twin": price = 30.00; break;
        case "double": price = 40.00; break;
        case "queen": price = 55.00; break;
        case "king": price = 70.00; break;
        default:
            size = "twin"; color = "white"; material = "cotton"; price = 30.00;
            return;
    }
    size = sz;
}
    public void setColor(String cl){
        color = cl;
    }

    
    public void setMaterial(String mt) {
    mt = mt.toLowerCase();
    switch(mt) {
        case "cotton": price += 0; break;
        case "wool": price += 20; break;
        case "cashmere": price += 45; break;
        default:
            size = "twin"; color = "white"; material = "cotton"; price = 30.00;
            return;
    }
    material = mt;
}

    



    public String toString() {
    return size + " size " + color + " " + material + " blanket. Price $" + price;
    }
    

}
    
