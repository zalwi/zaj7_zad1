package data;

import java.util.Arrays;

public class Student extends Person{
    int gradesCount;
    private Grade[] grades;

    public Student(String firstName, String lastName, int gradesHistory) {
        super(firstName, lastName);
        grades = new Grade[gradesHistory];
        gradesCount = 0;
    }

    public void addGrade(Grade grade){
        if(gradesCount < grades.length){
            grades[gradesCount] = grade;
            gradesCount++;
        }else{
            System.out.println("Brak miejsca w dzienniku na nową ocenę!");
        }

    }

    public String showStudentGradesHistory() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
