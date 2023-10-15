package org.example.arithmetic;

import java.util.List;

import org.example.arithmetic.calculate.AdditionOperator;
import org.example.arithmetic.calculate.DivisionOperator;
import org.example.arithmetic.calculate.MultiplelicationOperator;
import org.example.arithmetic.calculate.NewArithmeticOperator;
import org.example.arithmetic.calculate.PositiveNumber;
import org.example.arithmetic.calculate.SubtractionOperator;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(
            new AdditionOperator(),
            new SubtractionOperator(),
            new MultiplelicationOperator(),
            new DivisionOperator()
    );

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2 ) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unsupported operator: " + operator))
                .calculate(operand1, operand2);
    }
}
