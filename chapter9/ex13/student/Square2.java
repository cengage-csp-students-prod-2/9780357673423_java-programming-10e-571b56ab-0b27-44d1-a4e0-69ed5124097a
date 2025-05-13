public class Square2 extends GeometricFigure2
{
  private double area;
  public Square2(int h)
  {
     super(h, h, "Square");
  }
  public double figureArea(int h, int w)
  {
     area = (double)(h * w);
     return area;
  }
  public void displaySides()
  {
     System.out.println("This figure has four sides");
  }
}
