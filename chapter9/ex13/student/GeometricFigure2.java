
public abstract class GeometricFigure2{
    protected String figure;
    protected double height;
    protected double width;

    public GeometricFigure2(double h , double  w, String f){

        figure = f;
        height = h;
        width = w ;
    }

    public abstract double figureArea();
    public abstract displaySides();

    public  double getHeight(){
        return height;

    }
    public double getWidth(){
        return width;
    }
    public String figure(){
        return figure;
    }

    public void setFigure(String fig){
        this.figure = fig;
    }public void setHeight( double h){
        this.height = h;

    }public void setWidth( double w){
        this.width = w;

    }
}