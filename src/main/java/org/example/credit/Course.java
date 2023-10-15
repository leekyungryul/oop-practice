package org.example.credit;

public class Course {
    // 과목명
    private final String subject;
    // 학점
    private final int credit;
    // 성적
    private final String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double grade = 0;
        switch (this.grade) {
            case "A+":
                return 4.5;
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 3.0;
            case "C":
                return 3.0;
        }
        return grade;
    }
}
