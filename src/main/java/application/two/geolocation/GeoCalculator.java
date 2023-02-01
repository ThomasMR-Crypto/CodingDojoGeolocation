package application.two.geolocation;

public interface GeoCalculator {

    double distanceCartisian(int a1, int a2, int b1, int b2);

    double distanceCartisian(Point point1, Point point2);
}