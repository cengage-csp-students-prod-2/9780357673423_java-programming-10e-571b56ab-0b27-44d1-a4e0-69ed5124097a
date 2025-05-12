public abstract class GeometricFigure2 implements SidedObject {
    protected String figure;
    protected int height;
    protected int width;

    public GeometricFigure2(int h, int w, String f) {
        figure = f;
        height = h;
        width = w;
    }

    public abstract double figureArea();

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String fig) {
        this.figure = fig;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public void setWidth(int w) {
        this.width = w;
    }
}
