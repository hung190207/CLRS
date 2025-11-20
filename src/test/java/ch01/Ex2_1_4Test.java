package ch01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_1_4Test {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 1, 1}, new int[]{0, 1, 0, 1}, new int[]{1, 0, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] a, int[] b, int[] expected) {
        int[] actual = new Ex2_1_4().binaryAdd(a, b);
        assertArrayEquals(expected, actual);
    }

}