package model;

public class Faculty  {

    private Group[] groups;

    public Faculty(Group... groups) {
      this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }
}