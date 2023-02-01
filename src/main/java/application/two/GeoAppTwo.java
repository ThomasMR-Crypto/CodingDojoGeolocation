package application.two;

import application.two.geolocation.GeoCalculator;
import application.two.geolocation.GeoCalculatorImpl;
import application.two.geolocation.Point;

public class GeoAppTwo {

    public static double distanceCartisian(int x1, int y1, int x2, int y2) {
        GeoCalculator calculator = new GeoCalculatorImpl();
        return calculator.distanceCartisian(x1,y1,x2,y2);
    }
    public static double distanceCartisian(Point point1, Point point2) {
        GeoCalculator calculator = new GeoCalculatorImpl();
        return calculator.distanceCartisian(point1,point2);
    }
}
