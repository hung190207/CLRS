package ch02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_3_2Test {
    public static Stream<Arguments> test() {
        return Stream.of(
                // Left: [3, 26, 41, 52], Right: [9, 38, 49, 57]
                Arguments.of(new int[]{3, 26, 41, 52, 9, 38, 49, 57}, 0, 3, 7,
                        new int[]{3, 9, 26, 38, 41, 49, 52, 57})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] A, int p, int q, int r, int[] expected) {
        int[] actual = Ex2_3_2.merge(A, p, q, r);
        assertArrayEquals(expected, actual);
    }
}