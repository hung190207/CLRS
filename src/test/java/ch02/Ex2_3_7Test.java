package ch02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_3_7Test {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 7, 9, 4}, 10, true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] S, int x, boolean expected) {
        boolean actual = new Ex2_3_7().twoSum(S, x);
        assertEquals(expected, actual);
    }
}