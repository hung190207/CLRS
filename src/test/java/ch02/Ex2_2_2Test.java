package ch02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_2_2Test {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{4, 5, 3, 2, 6}, new int[]{2, 3, 4, 5, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int[] expected) {
        int[] actual = new Ex2_2_2().selectionSort(nums);
        assertArrayEquals(expected, actual);
    }

}