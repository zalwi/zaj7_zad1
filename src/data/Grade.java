package data;

public class Grade {
    private int value;
    private StudentGroup studentGroup;

    public Grade(int value, StudentGroup studentGroup) {
        this.value = value;
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "value=" + value +
                ", studentGroup=" + studentGroup.getName() +
                ", leader=" + studentGroup.getLeader().toString() +
                '}';
    }
}
