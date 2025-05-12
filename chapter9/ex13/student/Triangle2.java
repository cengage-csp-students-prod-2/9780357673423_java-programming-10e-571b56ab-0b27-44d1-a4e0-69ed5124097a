// Write your code here

public class Triangle2 extends GeometricFigure2{
    protected double area;

    public Triangle2(double h , double  w){

        super(h, w, "triangle");
        area = figureArea();


    }
    @Override
    public double figureArea(){

       return  (this.getHeight() * this.getWidth() )/ 2;

    }
    public void displaySides(){
        System.out.print("There are two sides" + height  +" "+ width);

    }

    public double getArea(){
        return area ;
    }

   
    
}