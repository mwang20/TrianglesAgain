public class Tester{
  public static void main(String[] args){
    Point testPoint = new Point(1, 2);
    Point other = new Point(1, 6);
    Triangle testTriangle = new Triangle(0, 0, 0, 5, 5, 5);
    System.out.println(testPoint.getX()); //Should return 1
    System.out.println();
    System.out.println(testPoint.getY()); //Should return 2
    System.out.println();
    System.out.println(testPoint.distanceTo(other)); //Should return 4
    System.out.println();
    System.out.println(testPoint.equals(other)); //Should return false
    System.out.println();
    System.out.println(testPoint.equals(testPoint)); //Should return true
    System.out.println();
    System.out.println(testTriangle.getPerimeter()); //Should return approxiamately 17
    System.out.println();
    System.out.println(testTriangle.getArea()); //Should return 12.5
    System.out.println();
    System.out.println(testTriangle.classify()); //Should return Isosceles
    System.out.println();
    System.out.println(testTriangle.toString()); //should return v1(0.0, 0.0) v2(0.0, 5.0) v3(5.0, 5.0)
    System.out.println();
    testTriangle.setVertex(0, testPoint); //Should replace v1 with testPoint
    System.out.println();
    System.out.println(testTriangle.toString()); //Should return v1(1.0, 2.0) v2(0.0, 5.0) v3(5.0, 5.0)
    System.out.println();
    testTriangle.setVertex(1, other); //Should replace v2 with other
    System.out.println();
    System.out.println(testTriangle.toString()); //Should return v1(1.0, 2.0) v2(1.0, 6.0) v3(5.0, 5.0)
  }
}
