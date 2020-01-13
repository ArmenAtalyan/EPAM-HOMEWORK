package model;

import exceptions.NullGroupException;

public class Faculty  {

    private String name;
    private Group[] groups;

    public Faculty(String name, Group... groups) {
        try {
            if(groups.length == 0){
                throw new NullGroupException();
            }
        }catch (NullGroupException e){}
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