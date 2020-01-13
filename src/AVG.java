import exceptions.InvalidMarkException;
import model.Group;
import model.Mark;
import model.Student;
import model.Subject;

public class AVG {

    public static int getAVGForStudent(Student student){
        Mark[] marks = student.getMarks();
        int average = 0;

            if(marks.length == 0)
                throw new InvalidMarkException();
            else{
                for (Mark mark : marks){
                    average += mark.getMark();
                }
            }
        return average/student.getMarks().length;
    }

    public static int getAVGForGroup(Group group, Subject subject){
        int average = 0;
        int count = 0;
        Student[] students = group.getStudents();
        for(Student student : students){
            for(Mark mark : student.getMarks()){
                if(mark.getSubject().equals(mark)){
                    average += mark.getMark();
                    count++;
                    break;
                }
            }
        }
        return average/count;
    }

    public static int getAVGForFaculty(){
        return 0;
    }

    public static int getAVGForUniversity(){
        return 0;
    }

}
