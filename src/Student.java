public class Student implements University {

    private String department;
    private String[] subject;
    private int[] marks;
    private int group;

    public Student(){}

    public Student(String department, String[] subject, int group) {
        this.department = department;
        this.subject = subject;
        this.marks = new int[subject.length];
        this.group = group;
    }

    @Override
    public int getAverageMark(int[] marks) throws InvalidMarkExeption {
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] < 0 || marks[i] > 10)
                throw new InvalidMarkExeption("Mark can't be bigger then 10 and smaller then 1!");
            else
                sum += marks[i];
        }
        return sum/marks.length;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
