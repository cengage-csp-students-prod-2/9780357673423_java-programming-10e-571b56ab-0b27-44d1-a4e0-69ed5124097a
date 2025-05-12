public class Square extends GeometricFigure {
    protected double area;

    public Square(double side) {
        super(side, side, "Square");
        area = figureArea();
    }

    @Override
    public double figureArea() {
        return height * width;
    }

    public double getArea() {
        return area;
    }
}
