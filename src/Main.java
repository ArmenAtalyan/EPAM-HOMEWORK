import model.Mark;
import model.Student;
import model.Subject;

public class Main {

    public static void main(String[] args) {

        Subject qimia = new Subject(1, "History");
        Subject matem = new Subject(2, "Math");
        Subject fizika = new Subject(2, "Physics");
        Student name_student = new Student.StudentBuilder()
                .id(1)
                .name("Vardan")
                .marks().build();
        System.out.println("avg for student " + AVG.getAVGForStudent(name_student));

    }
}
