package org.example.credit;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * • 일급 컬렉션 사용을 지향한다.
 */
public class GradeCalculatorTest {

    @DisplayName("평균학점을 계산한다.")
    @Test
    void calculateGradeTest() {

        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("WEB", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(new Courses(courses));
        double gradeResult = gradeCalculator.calculate();

        assertThat(gradeResult).isEqualTo(4.5);
    }

}
