package model;

import exception.InvalidMarkException;

public class Mark {
    private Subject subject;
    private int mark;

    public Mark(Subject subject, int mark) throws InvalidMarkException {
        if(mark < 0 || mark > 10)
            throw new InvalidMarkException("Mark must be more than 0 and less than 10.");
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