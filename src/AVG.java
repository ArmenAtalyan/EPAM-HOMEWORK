import exceptions.InvalidMarkException;
import model.Mark;
import model.Student;

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

    public static int getAVGForGroup(){
        return 0;
    }
    public static int getAVGForFaculty(){
        return 0;
    }
    public static int getAVGForUniversity(){
        return 0;
    }

}
