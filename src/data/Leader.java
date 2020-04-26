package data;

public class Leader extends Person{

    public Leader(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Leader{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
