import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class MainApp {

    public static void main(String[] args) {
        var harald = new Location("Munich", 48.1462071, 11.5046003);
        var raphael =  new Location("Hamburg", 53.5449532, 10.0285793);
        var distance = calcDistance(harald, raphael);

        System.out.println(distance);
        System.out.printf("%s - %s = %f km", harald.getName(), raphael.getName(), harald.calcDistance(raphael));
    }

    private static double calcDistance(Point2D p1, Point2D p2) {
        return sqrt(pow(p1.getX() - p2.getX(), 2) + pow(p1.getY() - p2.getY(), 2));
    }
}