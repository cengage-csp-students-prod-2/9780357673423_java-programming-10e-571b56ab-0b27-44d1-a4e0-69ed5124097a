// Write your code here
public abstract class GeometricFigure{
    protected String figure;
    protected int height;
    protected int width;

    public GeometricFigure(int h , int  w, String f){

        figure = f;
        height = h;
        width = w ;
    }

    public abstract double figureArea();

    public  int getHeight(){
        return height;

    }
    public int getWidth(){
        return width;
    }
    public String getFigure(){
        return figure;
    }

    
}