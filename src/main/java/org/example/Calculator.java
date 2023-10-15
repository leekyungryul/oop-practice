package org.example;

import java.util.List;

import org.example.calculate.AdditionOperator;
import org.example.calculate.DivisionOperator;
import org.example.calculate.MultiplelicationOperator;
import org.example.calculate.NewArithmeticOperator;
import org.example.calculate.PositiveNumber;
import org.example.calculate.SubtractionOperator;

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
