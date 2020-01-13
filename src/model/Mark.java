package model;

import exceptions.InvalidMarkException;
import exceptions.NullSubjectException;

public class Mark {
    private Subject subject;
    private int mark;

    public Mark(Subject subject, int mark) throws InvalidMarkException {
        if(subject == null)
            throw new InvalidMarkException();
        this.subject = subject;
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getMark() {
        return mark;
    }

}