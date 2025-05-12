// Write your code here


public class Square extends GeometricFigure{
    protected double area;

    public Square(double h , double  w, String f){

        super(h, w, f);
        figureArea(h,w);

    }
   
    public void figureArea(double h , double w){

        area = this.getHeight() * this.getWidth() ;
    }

    public double getArea(){
        return area ;
    }

    public void display(){
        System.out.println("The Square with height = " + this.getHeight() + "and with width = " + this.getWidth() + " has an area of " + this.getArea() );
    }
}