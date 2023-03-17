package exercise4;

public class Student {

    private static String studentName;
    private static double studentGrade;
    private static double sumOfGrades = 0;
    private static int numberOfStudents = 0;

    public Student(String studentName, double studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        sumOfGrades += studentGrade;
        numberOfStudents++;
    }

    public static double averageGrade() {
        return sumOfGrades / numberOfStudents;

    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentGrade() {
        return studentGrade;
    }
}
