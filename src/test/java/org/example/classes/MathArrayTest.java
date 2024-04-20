package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathArrayTest {

    @Test
    void oddsToArray_positiveNumber_returnsArray() {
        int[] expectedResult = {1, 3, 5};
        int[] result = MathArray.oddsToArray(5);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void oddsToArray_negativeInt_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathArray.oddsToArray(-5);
        });
    }

    @Test
    void oddsToArray_numberOne_returnsArrayOneValue() {
        int[] expectedResult = {1};
        int[] result = MathArray.oddsToArray(1);
        assertArrayEquals(expectedResult, result);

    }
}