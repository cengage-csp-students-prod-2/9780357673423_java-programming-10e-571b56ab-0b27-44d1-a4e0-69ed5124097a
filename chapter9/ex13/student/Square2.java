public class Square2 extends GeometricFigure2 {
    private double area;

    public Square2(int h) {
        super(h, h, "Square");
        area = figureArea();
    }

    @Override
    public double figureArea() {
        return height * width;
    }

    @Override
    public void displaySides() {
        System.out.println("A square has 4 sides.");
    }

    public double getArea() {
        return area;
    }
}
