package service;

import model.*;

public class Average {

    public static int getAVGForStudent(Student student){
        Mark[] marks = student.getMarks();
        int average = 0;
                for (Mark mark : marks){
                    average += mark.getMark();
                }
        return average/student.getMarks().length;
    }

    public static int getAVGForGroup(Group group, Subject subject){
        int average = 0;
        int count = 0;
        Student[] students = group.getStudents();
        for(Student student : students){
            for(Mark mark : student.getMarks()){
                if(mark.getSubject().equals(subject)){
                    average += mark.getMark();
                    count++;
                    break;
                }
            }
        }
        return average/count;
    }

    public static int getAVGForFaculty(Faculty faculty, Subject subject){
        int average = 0;
        for(Group group : faculty.getGroups()){
            average += getAVGForGroup(group, subject);
        }
        return average/faculty.getGroups().length;
    }

    public static int getAVGForUniversity(University university, Subject subject){
        int average = 0;
        for(Faculty faculty : university.getFaculties()){
            average += getAVGForFaculty(faculty, subject);
        }
        return average/university.getFaculties().length;
    }

}
