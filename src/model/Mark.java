package model;

public class Mark {
    private Subject subject;
    private int mark;

    public Mark(Subject subject, int mark) {
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