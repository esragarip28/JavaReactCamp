package day3_hw2;

import java.util.List;

public class Student extends User {

    private int studentNo;
    private String studentClass; // as 10B,8A
    private List<String> lessonsStudentHas;   //the list keep lessons student has
    private double studentAverageGrade;

    public Student(int ID, String name, String surname, int age, String email, String phoneNumber, int studentNo,
                   String studentClass, List<String> lessonsStudentHas, double studentAverageGrade) {
        super(ID, name, surname, age, email, phoneNumber);
        this.studentNo = studentNo;
        this.studentClass = studentClass;
        this.lessonsStudentHas = lessonsStudentHas;
        this.studentAverageGrade = studentAverageGrade;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public List<String> getLessonsStudentHas() {
        return lessonsStudentHas;
    }

    public void setLessonsStudentHas(List<String> lessonsStudentHas) {
        this.lessonsStudentHas = lessonsStudentHas;
    }

    public double getStudentAverageGrade() {
        return studentAverageGrade;
    }

    public void setStudentAverageGrade(double studentAverageGrade) {
        this.studentAverageGrade = studentAverageGrade;
    }
}
