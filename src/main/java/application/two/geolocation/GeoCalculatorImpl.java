package application.two.geolocation;

/*
Quellen: https://de.wikipedia.org/wiki/Abstand
 */
public class GeoCalculatorImpl implements GeoCalculator {
    @Override
    public double distanceCartisian(int a1, int a2, int b1, int b2) {
        return Math.sqrt((a1 - b1) * (a1 - b1) + (a2 - b2) * (a2 - b2));
    }

    @Override
    public double distanceCartisian(Point point1, Point point2) {
        return distanceCartisian(point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }
}