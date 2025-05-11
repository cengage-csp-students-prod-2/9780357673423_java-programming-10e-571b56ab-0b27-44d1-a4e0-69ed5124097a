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
    if (sz.equals("twin") || sz.equals("double") || sz.equals("queen") || sz.equals("king")) {
            size = sz;
        } else {
            resetDefault();
            return;
        }

    updateprice();
}
    public void setColor(String cl){
        color = cl;
    }


    public void setMaterial(String mt) {
    mt = mt.toLowerCase();
    if (mt.equals("cotton") || mt.equals("wool") || mt.equals("cashmere")) {
            material = mt;
        } else {
            resetDefault();
            return;
        }

    updateprice();
}

    



    public String toString() {
    return size + " size " + color + " " + material + " blanket. Price $" + price;
    }

    public void resetDefault(){
        size = "twin";
        color = "white";
        material = "cotton";
        price = 30.00;
    }

    public void updateprice(){
        switch(size) {
        case "twin": price += 0.00; break;
        case "double": price += 10.00; break;
        case "queen": price += 25.00; break;
        case "king": price += 40.00; break;
    }
    
    switch(material) {
        case "cotton": price += 0.00; break;
        case "wool": price += 20; break;
        case "cashmere": price += 45; break;
    }
    }
    

}
    
