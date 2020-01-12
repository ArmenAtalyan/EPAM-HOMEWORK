

public class Student {

    private int id;
    private String name;
    private String faculty;
    private String[] subject;
    private int[] marks;
    private int groupID;

    public Student(){}

    public Student(StudentBuilder builder) {
        id = builder.id;
        name = builder.name;
        faculty = builder.faculty;
        subject = builder.subject;
        marks = builder.marks;
        groupID = builder.groupID;
    }


    public int getAverageMark(int[] marks) throws InvalidMarkException {
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] < 0 || marks[i] > 10)
                throw new InvalidMarkException("Mark can't be bigger then 10 and smaller then 1!");
            else
                sum += marks[i];
        }
        return sum/marks.length;
    }

  public static class StudentBuilder{
      private int id;
      private String name;
      private String faculty;
      private String[] subject;
      private int[] marks;
      private int groupID;

      public StudentBuilder id(int id){
          this.id = id;
          return this;
      }
      public StudentBuilder name(String name){
          this.name = name;
          return this;
      }
      public StudentBuilder faculty(String faculty){
          this.faculty = faculty;
          return this;
      }
      public StudentBuilder subject(String[] subject){
          this.subject = subject;
          return this;
      }
      public StudentBuilder marks(int[] marks){
          this.marks = marks;
          return this;
      }
      public StudentBuilder groupID(int groupID){
          this.groupID = groupID;
          return this;
      }
      public Student build(){
            Student student = new Student();
            return student;
      }
  }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String[] getSubject() {
        return subject;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getGroupID() {
        return groupID;
    }
}
