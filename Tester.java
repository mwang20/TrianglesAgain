public class Tester{
  public static void main(String[] args){
    Point testPoint = new Point(1, 2);
    Point other = new Point(1, 6);
    System.out.println(testPoint.getX()); //Should return 1
    System.out.println();
    System.out.println(testPoint.getY()); //Should return 2
    System.out.println();
    System.out.println(testPoint.distanceTo(other)); //Should return 4
    System.out.println();
    System.out.println(testPoint.equals(other)); //Should return false
    System.out.println();
    System.out.println(testPoint.equals(testPoint)); //Should return true
  }
}
