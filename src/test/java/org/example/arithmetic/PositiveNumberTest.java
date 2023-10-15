package org.example.arithmetic;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.example.arithmetic.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositiveNumberTest {

    @DisplayName("0 또는 음수를 입력할 수 없다.")
    @ParameterizedTest
    @ValueSource(ints = {0, -1, -2, -3})
    void createTest(int value) {
        assertThatCode(() -> new PositiveNumber(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 또는 음수는 입력할 수 없습니다.");
    }
}
