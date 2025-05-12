// Write your code here


public class Square extends GeometricFigure{
    protected double area;

    public Square(int h ){

        super(h, h, "square");
        area  = figureArea(h, h);

    }
   @Override
    public double figureArea(int h , int w){

        return h * w;

    }

    public double getArea(){
        return area ;
    }

    
}