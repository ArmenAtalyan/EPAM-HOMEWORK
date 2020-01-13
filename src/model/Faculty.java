package model;

import exceptions.NullGroupException;

public class Faculty  {

    private String name;
    private Group[] groups;

    public Faculty(String name, Group... groups) throws NullGroupException {

            if(groups.length == 0)
                throw new NullGroupException();
        this.name = name;
      this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public Group[] getGroups() {
        return groups;
    }
}