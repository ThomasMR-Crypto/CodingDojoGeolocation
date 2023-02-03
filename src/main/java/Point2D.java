import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point2D {
    private double x;
    private double y;

    Point2D(double x, double y) {
        setX(x);
        setY(y);
    }

    double calcDistance(Point2D p) {
        return sqrt(pow(this.getX() - p.getX(), 2) + pow(this.getY() - p.getY(), 2));
    }


    //

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x * 111.3;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y * 71.5;
    }
}
