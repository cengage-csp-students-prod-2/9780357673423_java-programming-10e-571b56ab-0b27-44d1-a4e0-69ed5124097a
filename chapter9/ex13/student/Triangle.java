// Write your code here

public class Triangle extends GeometricFigure{
    protected double area;

    public Triangle(double h , double  w, String f){

        super(h, w, f);

    }
    @Override
    public void figureArea(){

        area = this.getHeight() * this.getWidth() / 2;
    }


    public double getArea(){
        return area ;
    }

    public void display(){
        System.out.println("The Triangle with height = " + this.getHeight() + "and with width = " + this.getWidth() + " has an area of " + this.getArea() );
    }
    
}