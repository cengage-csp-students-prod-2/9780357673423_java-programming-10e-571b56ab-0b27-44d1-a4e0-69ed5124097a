public class Triangle2 extends GeometricFigure2 {
    private double area;

    public Triangle2(int h, int w) {
        super(h, w, "Triangle");
        area = figureArea();
    }

    @Override
    public double figureArea() {
        return (height * width) / 2.0;
    }

    @Override
    public void displaySides() {
        System.out.println("A triangle has 3 sides.");
    }

    public double getArea() {
        return area;
    }
}
