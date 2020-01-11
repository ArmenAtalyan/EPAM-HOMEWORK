public class Group implements University {

    private Student[] students;
    Student student = new Student();

    @Override
    public int getAverageMark(int[] marks) {
        int sum = 0;
        for (int i = 0; i < students.length; i++){

        }
        return sum/students.length;
    }

    public Group(){}

    public Group(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
