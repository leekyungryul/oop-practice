package org.example.credit;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    /**
     * 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
     * @return
     */
    public double calculate() {
        // (학점수*교과목 평점)의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        // 수강신청 총 학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();


        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
