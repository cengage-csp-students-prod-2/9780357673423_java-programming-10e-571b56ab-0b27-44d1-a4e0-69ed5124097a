// Write your code here

public class Triangle extends GeometricFigure{
    protected double area;

    public Triangle(int h , int  w){

        super(h, w, "triangle");
        area = figureArea(h, w);


    }
   @Override
    public double figureArea(int h , int w){

        return  (h * w) / 2;
    }


    public double getArea(){
        return area ;
    }

    
    
}