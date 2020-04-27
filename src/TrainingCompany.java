import data.Leader;
import data.Student;
import data.StudentGroup;

public class TrainingCompany {
    public static void main(String[] args) {
        Leader  pawel = new Leader("Paweł", "Pierwszy"),
                adam = new Leader("Adam", "Drugi");

        Student kamil = new Student("Kamil", "Zalwert", 4),
                jan = new Student("Jan", "Kowalski", 4),
                maciej = new Student("Maciej", "Brzęczyszczykiewicz", 4);

        Student[]   physicsGroupStudents = {kamil,jan},
                    mathGroupStudents = {kamil,maciej};

        StudentGroup    physicsGroup = new StudentGroup("Fizyka", pawel, physicsGroupStudents),
                        mathGroup = new StudentGroup("Matematyka", adam, mathGroupStudents);

        System.out.println(physicsGroup.toString());
        System.out.println(mathGroup.toString());

        physicsGroup.addGradeToStudent(0,4);
        physicsGroup.addGradeToStudent(0,5);
        mathGroup.addGradeToStudent(0,4);
        mathGroup.addGradeToStudent(0,5);
        mathGroup.addGradeToStudent(0,2); //przekroczony rozmiar tablicy - historii ocen

        System.out.println(kamil.showStudentGradesHistory());

    }
}
