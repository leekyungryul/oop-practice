package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * • 간단한 사칙연산을 할 수 있다.
 * • 양수로만 계산할 수 있다.
 * • 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
 */
class CalculatorTest {

    @DisplayName("사칙연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int operand1, String operator, int operand2, int result) {

        int calculateResult = Calculator.calculate(operand1, operator, operand2);

        assertThat(calculateResult).isEqualTo(result);

    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                Arguments.of(1, "+", 2, 3),
                Arguments.of(1, "-", 2, -1),
                Arguments.of(4, "*", 2, 8),
                Arguments.of(4, "/", 2, 2)
        );
    }
}