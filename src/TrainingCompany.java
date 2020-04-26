import data.Leader;
import data.Student;
import data.StudentGroup;

public class TrainingCompany {
    public static void main(String[] args) {
        Leader  pawel = new Leader("Paweł", "Pierwszy"),
                adam = new Leader("Adam", "Drugi");

        Student kamil = new Student("Kamil", "Zalwert"),
                jan = new Student("Jan", "Kowalski"),
                maciej = new Student("Maciej", "Brzęczyszczykiewicz");

        Student[]   physicsGroupStudents = {kamil,jan},
                    mathGroupStudents = {kamil,maciej};

        StudentGroup    physicsGroup = new StudentGroup("Fizyka", pawel, physicsGroupStudents),
                        mathGroup = new StudentGroup("Matematyka", adam, mathGroupStudents);

        System.out.println(physicsGroup.toString());
        System.out.println(mathGroup.toString());

    }
}
