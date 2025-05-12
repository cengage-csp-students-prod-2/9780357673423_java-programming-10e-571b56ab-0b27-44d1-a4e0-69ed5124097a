// Write your code here

public class Triangle extends GeometricFigure{
    protected double area;

    public Triangle(double h , double  w){

        super(h, w, "triangle");
        area = figureArea();


    }
   @Override
    public double figureArea(){

        return  (this.getHeight() * this.getWidth()) / 2;
    }


    public double getArea(){
        return area ;
    }

    
    
}