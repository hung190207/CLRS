import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_1_3Test {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] arr, int target, int expected) {
        int actual = new Ex2_1_3().linearSearch(arr, target);
        assertEquals(expected, actual);

    }

}