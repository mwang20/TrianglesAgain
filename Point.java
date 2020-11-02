import java.lang.Math;
public class Point{
  private double x, y;
  public Point(double X, double Y){
    x = X;
    y = Y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public double distanceTo(Point other){
    return Math.sqrt(Math.pow((getX() - other.getX()), 2) + Math.pow((getY() - other.getY()), 2));
  }
  public boolean equals(Point other){
    if (getX() == other.getX() && getY() == other.getY()){
      return true;
    }
    return false;
  }
  public String toString(){
    return "(" + x + "," + y + ")";
  }
}
