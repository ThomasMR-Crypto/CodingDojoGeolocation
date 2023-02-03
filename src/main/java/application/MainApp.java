package application;

import java.awt.geom.Point2D;

public class MainApp {

    public static void main(String[] args) {
        // Hier könnte Ihre Logik stehen
        int x=5;
        int y=5;

        int x2=-10;
        int y2=20;

        double reesult1 = myDistance(x, y, x2, y2);
        double reesult2 = myDistance2(x, y, x2, y2);

        System.out.println(reesult1+" ___ "+reesult2);

    }

    private static double myDistance(int x, int y, int x2, int y2) {
        return Point2D.distance(x, y, x2, y2);
    }

    private static double myDistance2(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return d;
    }
}