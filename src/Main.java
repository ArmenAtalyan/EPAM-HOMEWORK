public class Main {

    public static void main(String[] args) {

        String[] subjects = {"Math analysis", "cs", "history", "data analysis", "js"};
        int[] marks = {56, 71, 100, 60, 44};

        Student st = new Student.StudentBuilder().
                id(1).name("Ramzesik").
                faculty("Math").
                groupID(4).
                subject(subjects).
                marks(marks).
                build();

        try {
            System.out.println(st.getAverageMark(marks));
        }catch (InvalidMarkException e){}

    }
}
