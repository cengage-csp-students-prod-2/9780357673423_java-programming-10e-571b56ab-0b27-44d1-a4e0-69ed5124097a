public class Blanket {
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    protected double sizePremium;
    protected double materialPremium;
    private final String SIZE1 = "twin";
    private final String SIZE2 = "double";
    private final String SIZE3 = "queen";
    private final String SIZE4 = "king";
    protected final double BASE_PRICE = 30;
    private final double S_PRICE2 = 10;
    private final double S_PRICE3 = 25;
    private final double S_PRICE4 = 40;
    private final String MAT1 = "cotton";
    private final String MAT2 = "wool";
    private final String MAT3 = "cashmere";
    private final double M_PRICE2 = 20;
    private final double M_PRICE3 = 45;
    public Blanket()    {
       setDefaults();
    }
    private void setDefaults()    {
       size = SIZE1;
       color = "white";
       material = "cotton";
       sizePremium = 0;
       materialPremium = 0;
       price = BASE_PRICE;
    }
    public String getSize()    {
       return size;
    }
    public String getColor()    {
       return color;
    }
    public String getMaterial()    {
       return material;
    }
    public void setSize(String s)    {
       size = s;
       if(s.equals(SIZE1))
          sizePremium = 0;
       else
          if(s.equals(SIZE2))
             sizePremium = S_PRICE2;
          else
             if(s.equals(SIZE3))
                sizePremium = S_PRICE3;
             else
                if(s.equals(SIZE4))
                   sizePremium = S_PRICE4;
                else
                   setDefaults();
       price = BASE_PRICE + sizePremium + materialPremium;               
    }
    public void setMaterial(String m)    {
       material = m;
       if(m.equals(MAT1))
          materialPremium = 0;
       else
          if(m.equals(MAT2))
             materialPremium = M_PRICE2;
          else
             if(m.equals(MAT3))
                materialPremium = M_PRICE3;
             else
                setDefaults();
       price = BASE_PRICE + sizePremium + materialPremium; 
    }
    public void setColor(String color)    {
       this.color = color;
    }
    public String toString()    {
       return size + " size " + color + " " + material +
          " blanket.  Price $" + price;
    }
 }
 
// getting 92 % on this 
// // Write your code here
// public   class Blanket{
//     protected String size;
//     protected String color;
//     protected String material;
//     protected double price;

//     public Blanket(){
//         size = "twin";
//         color = "white";
//         material = "cotton";
//         price = 30.00;
//     }

//     public String getSize(){
//         return size;
//     }
//     public String getColor(){
//         return color;
//     }
//     public String getMaterial(){
//         return material;
//     }
//     public double getPrice(){
//         return price;
//     }

//     public void setSize(String sz) {
//     sz = sz.toLowerCase();
//     if (sz.equals("twin") || sz.equals("double") || sz.equals("queen") || sz.equals("king")) {
//             size = sz;
//         } else {
//             resetDefault();
//             return;
//         }

//     updateprice();
// }
//     public void setColor(String cl){
//         color = cl;
//     }


//     public void setMaterial(String mt) {
//     mt = mt.toLowerCase();
//     if (mt.equals("cotton") || mt.equals("wool") || mt.equals("cashmere")) {
//             material = mt;
//         } else {
//             resetDefault();
//             return;
//         }

//     updateprice();
// }

    



//     public String toString() {
//     return size + " size " + color + " " + material + " blanket. Price $" + price;
//     }

//     public void resetDefault(){
//         size = "twin";
//         color = "white";
//         material = "cotton";
//         price = 30.00;
//     }

//     public void updateprice(){
//         price = 30.00;
//         switch(size) {
        
//         case "double": price += 10.00; break;
//         case "queen": price += 25.00; break;
//         case "king": price += 40.00; break;
//     }
    
//     switch(material) {
        
//         case "wool": price += 20; break;
//         case "cashmere": price += 45; break;
//     }
//     }
    

// }
    
