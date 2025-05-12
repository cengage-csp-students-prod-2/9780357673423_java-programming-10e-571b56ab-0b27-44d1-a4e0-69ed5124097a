// Write your code here
// Write your code here


public class Square2 extends GeometricFigure2{
    protected double area;

    public Square2(double h ){

        super(h, h, "square");
        area = figureArea();

    }
   @Override
    public double figureArea(){

        return this.getHeight() * this.getWidth() ;

    }

    public void displaySides(){
        System.out.println("There are one sides" + height);

    }

    public double getArea(){
        return area ;
    }

    
}