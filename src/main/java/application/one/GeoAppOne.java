package application.one;

import java.awt.*;

public class GeoAppOne {
    public static double distanceCartisian(int x1, int y1, int x2, int y2) {
        return new Point(x1,y1).distance(new Point(x2,y2));
    }
    public static double distanceCartisian(Point point1, Point point2) {
        return point1.distance(point2);
    }
}
