package ch02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_1_2Test {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{31, 41, 59, 26, 41, 58}, new int[]{59, 58, 41, 41, 31, 26})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] arr, int[] expected) {
        int[] actual = new Ex2_1_2().insertionSort(arr);
        assertArrayEquals(expected, actual);
    }

}