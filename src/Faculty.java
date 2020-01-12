public class Faculty  {

    public int getAverageMark(Group[] groups, String subject) {
        int sum = 0;

        for (int i = 0; i < groups.length; i++){
            sum += groups[i].getAverageMark();
        }
        return sum/groups.length;
    }
}
