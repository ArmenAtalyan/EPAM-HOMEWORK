public class Department implements University {

    private int[] groups;

    @Override
    public int getAverageMark(int[] marks) {
        return 0;
    }

    public Department(int[] groups) {
        this.groups = groups;
    }

    public int[] getGroups() {
        return groups;
    }

    public void setGroups(int[] groups) {
        this.groups = groups;
    }
}
