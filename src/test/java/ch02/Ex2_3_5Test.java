package ch02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_3_5Test {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3, 0, 4, 2),
                Arguments.of(new int[]{20,30,40,50,100}, 100, 0, 4, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] arr, int x, int low, int high, int expected) {
        int actual = new Ex2_3_5().binarySearch(arr, x, low, high);
        assertEquals(expected, actual);
    }

}