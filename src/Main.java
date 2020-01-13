import exceptions.*;
import model.*;

public class Main {

    public static void main(String[] args) {

        Subject qimia = new Subject(1, "History");
        Subject matem = new Subject(2, "Math");
        Subject fizika = new Subject(3, "Physics");
        Subject socologia = new Subject(4, "Sociology");
        Subject patmutyun = new Subject(5, "History");
        Subject karavarum = new Subject(6, "Management");
        Subject fizkult = new Subject(8, "sports");
        Subject finansner = new Subject(9, "finance");
        Subject cs = new Subject(3, "computer science");

        try {
            Student student1 = new Student.StudentBuilder()
                    .id(1)
                    .name("Vardan")
                    .marks(new Mark(qimia, 8), new Mark(fizika, 3)).build();
            Student student2 = new Student.StudentBuilder()
                    .id(2)
                    .name("Areg")
                    .marks(new Mark(socologia, 7), new Mark(matem, 6), new Mark(patmutyun, 4)).build();
            Student student3 = new Student.StudentBuilder()
                    .id(3)
                    .name("Lilit")
                    .marks(new Mark(karavarum, 12), new Mark(fizkult, 5), new Mark(fizika, 3), new Mark(patmutyun, 3), new Mark(cs, 3)).build();
            Student student4 = new Student.StudentBuilder()
                    .id(4)
                    .name("Vahram")
                    .marks(new Mark(cs, 14), new Mark(matem, 11)).build();
            Student student5 = new Student.StudentBuilder()
                    .id(4)
                    .name("Ani")
                    .marks(new Mark(finansner, 11), new Mark(patmutyun, 17)).build();
            Student student6 = new Student.StudentBuilder()
                    .id(4)
                    .name("Hakob")
                    .marks(new Mark(socologia, -1), new Mark(matem, 11), new Mark(patmutyun, 18)).build();
            Student student7 = new Student.StudentBuilder()
                    .id(4)
                    .name("Arev")
                    .marks(new Mark(socologia, 14), new Mark(matem, 11), new Mark(patmutyun, 18), new Mark(cs, 18)).build();
            Student student8 = new Student.StudentBuilder()
                    .id(4)
                    .name("Sona")
                    .marks(new Mark(finansner, 14)).build();


        Group first = new Group(1, student1, student2);
        Group second = new Group(2, student3, student4);
        Group third = new Group(3, student5, student6);
        Group fourth = new Group(4, student7, student8);
        Faculty kiber = new Faculty("Cybernetics", first, second);
        Faculty kirarakan = new Faculty("Maths", third, fourth);
        University university = new University("EPH", kiber, kirarakan);


        System.out.println("average for student " + student1.getName() + " is " + Average.getAVGForStudent(student1));
        System.out.println("average for group " + first.getId() +  " is  " + Average.getAVGForGroup(first, matem));
        System.out.println("average for faculty " + kiber.getName() + " is " + Average.getAVGForFaculty(kiber, fizika));
        System.out.println("average for university " + university.getName() + " is " + Average.getAVGForUniversity(university, patmutyun));

        }catch (InvalidMarkException | NullStudentsException | NullGroupException | NullFacultyException | NullSubjectException e){}

    }
}
