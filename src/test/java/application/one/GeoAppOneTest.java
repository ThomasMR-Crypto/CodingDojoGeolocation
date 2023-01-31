package application.one;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.*;
import java.util.stream.Stream;

class GeoAppOneTest {

    @ParameterizedTest
    @MethodSource("pointTests")
    void testDistances(int x1, int y1, int x2, int y2, double expected) {
        Assertions.assertThat(expected).isEqualTo(GeoAppOne.distanceCartisian(x1, y1, x2, y2));
    }

    private static Stream<Arguments> pointTests() {
        return Stream.of(
                Arguments.of(0, 0, 0, 3, 3),
                Arguments.of(0, 0, 0, -3, 3),
                Arguments.of(5, 2, 1, 2, 4),
                Arguments.of(-10, -5, -5, -3, 5.385164807134504),
                Arguments.of(3, 3, -5, -3, 10.0)
        );
    }

    @ParameterizedTest
    @MethodSource("pointTests2")
    void testDistances(Point point1, Point point2, double expected) {
        Assertions.assertThat(expected).isEqualTo(GeoAppOne.distanceCartisian(point1, point2));
    }

    private static Stream<Arguments> pointTests2() {
        return Stream.of(
                Arguments.of(new Point(0, 0), new Point(0, 3), 3),
                Arguments.of(new Point(0, 0), new Point(0, -3), 3),
                Arguments.of(new Point(5, 2), new Point(1, 2), 4),
                Arguments.of(new Point(-10, -5), new Point(-5, -3), 5.385164807134504),
                Arguments.of(new Point(3, 3), new Point(-5, -3), 10.0)
        );
    }
}