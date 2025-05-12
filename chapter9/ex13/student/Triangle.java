public class Triangle extends GeometricFigure {
    protected double area;

    public Triangle(double h, double w) {
        super(h, w, "Triangle");
        area = figureArea();
    }

    @Override
    public double figureArea() {
        return (height * width) / 2;
    }

    public double getArea() {
        return area;
    }
}
