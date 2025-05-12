// Write your code here


public class Square extends GeometricFigure{
    protected double area;

    public Square(double h ){

        super(h, h, "square");
        area  = figureArea();

    }
   @Override
    public double figureArea(){

        return this.getHeight() * this.getWidth() ;

    }

    public double getArea(){
        return area ;
    }

    
}