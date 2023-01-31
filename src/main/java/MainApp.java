import java.awt.*;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("haaaalloooo");

        double result = manhattanDistance(new Point(1, 1), new Point(1, 1));
        System.out.println(result);
        //        manhattanDistance( Point(5, 4), Point(3, 2) ) should returns 4
        //        manhattanDistance( Point(1, 1), Point(0, 3) ) should returns 3
    }

    private static double manhattanDistance(Point point, Point point1) {
        return point.distance(point1);
    }
}

// Test