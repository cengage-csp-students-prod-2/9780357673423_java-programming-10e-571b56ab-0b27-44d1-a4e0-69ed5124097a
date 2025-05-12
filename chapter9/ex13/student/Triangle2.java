// Write your code here

public class Triangle2 extends GeometricFigure2{
    protected double area;

    public Triangle2(double h , double  w, String f){

        super(h, w, f);
        figureArea(h,w);


    }
   
    public void figureArea(double h , double w){

        area = this.getHeight() * this.getWidth() / 2;
    }
    public void displaySides(){
        System.out.println("There are two sides");

    }

    public double getArea(){
        return area ;
    }

    public void display(){
        System.out.println("The Triangle with height = " + this.getHeight() + "and with width = " + this.getWidth() + " has an area of " + this.getArea() );
    }
    
}