public abstract class GeometricFigure {
    protected String figure;
    protected double height;
    protected double width;

    public GeometricFigure(double h, double w, String f) {
        height = h;
        width = w;
        figure = f;
    }

    public abstract double figureArea();

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String fig) {
        this.figure = fig;
    }
}
