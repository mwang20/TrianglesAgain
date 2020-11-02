import java.lang.Math;
public class Triangle{
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle( double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3);
  }
  public double getArea(){
    double s = getPerimeter()/2;
    return Math.sqrt(s * (s - v1.distanceTo(v2)) * (s - v2.distanceTo(v3)) * (s - v1.distanceTo(v3)));
  }
  public String classify(){
    if (v1.distanceTo(v2) == v2.distanceTo(v3) && v1.distanceTo(v2) == v1.distanceTo(v3)){
      return "Equilateral";
    }
    else if (v1.distanceTo(v2) == v2.distanceTo(v3) || v1.distanceTo(v2) == v1.distanceTo(v3)){
      return "Isosceles";
    }
    return "Scalene";
  }
  public String toString(){
    return "v1" + v1.toString() + " v2" + v2.toString() + " v3" + v3.toString();
  }
  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }
    if (index == 1){
      v2 = newP;
    }
    v3 = newP;
  }
}
