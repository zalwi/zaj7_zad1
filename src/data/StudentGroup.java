package data;

import java.util.Arrays;

public class StudentGroup {
    String name;
    Leader leader;
    Student[] students;

    public StudentGroup(String name, Leader leader, Student[] students) {
        this.name = name;
        this.leader = leader;
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "name='" + name + '\'' +
                ", leader=" + leader +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
