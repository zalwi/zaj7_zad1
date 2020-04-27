package data;

import java.util.Arrays;

public class StudentGroup {
    private String name;
    private Leader leader;
    private Student[] students;

    public StudentGroup(String name, Leader leader, Student[] students) {
        this.name = name;
        this.leader = leader;
        this.students = students;
    }

    public void addGradeToStudent(int studentNo, int value){
        students[studentNo].addGrade(new Grade(value,this));
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "name='" + name + '\'' +
                ", leader=" + leader +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public Leader getLeader() {
        return leader;
    }

    public String getName() {
        return name;
    }
}
