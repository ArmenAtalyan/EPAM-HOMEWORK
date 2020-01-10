public class Group implements University {

    private String[] students;

    @Override
    public int getAverageMark(int[] marks) {
        Student student = new Student();

        return 0;
    }

    public Group(String[] students) {
        this.students = students;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }
}
