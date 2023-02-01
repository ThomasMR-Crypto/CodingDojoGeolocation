package application.two.geolocation;

import application.one.GeoAppOne;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class GeoCalculatorImplTest {


    GeoCalculator calculator = new GeoCalculatorImpl();

    @ParameterizedTest
    @MethodSource("pointTestsTwo")
    void testDistances(int x1, int y1, int x2, int y2, double expected) {
        Assertions.assertThat(expected).isEqualTo(calculator.distanceCartisian(x1, y1, x2, y2));
    }

    private static Stream<Arguments> pointTestsTwo() {
        return Stream.of(
                Arguments.of(0, 0, 0, 3, 3),
                Arguments.of(0, 0, 0, -3, 3),
                Arguments.of(5, 2, 1, 2, 4),
                Arguments.of(-10, -5, -5, -3, 5.385164807134504),
                Arguments.of(3, 3, -5, -3, 10.0)
        );
    }
}