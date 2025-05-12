// Write your code here
// Write your code here


public class Square2 extends GeometricFigure2{
    protected double area;

    public Square2(double h , double  w, String f){

        super(h, w, f);
        figureArea(h,w);

    }
   
    public void figureArea(double h , double w){

        area = this.getHeight() * this.getWidth() ;
    }

    public void displaySides(){
        System.out.println("There are two sides");

    }

    public double getArea(){
        return area ;
    }

    public void display(){
        System.out.println("The Square with height = " + this.getHeight() + "and with width = " + this.getWidth() + " has an area of " + this.getArea() );
    }
}