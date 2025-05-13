public class Triangle extends GeometricFigure
{
   private double area;
   public Triangle(int w, int h)
   {
      super(w, h, "Triangle");
   }
   public double figureArea(int w, int h)
   {
      area = (double)(w * h * 0.5);
      return area;
   }
}
