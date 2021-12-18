package design;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
    public List<Subject> subjects = new ArrayList<>();
    public abstract void update();

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
        subject.addObserver(this);
    }

    public void removeSubject(Subject subject) {
        this.subjects.remove(subject);
        subject.removeObserver(this);
    }
}
/*
 subject can have many observers
 observers can be of many type
 1 observer can any no. subject
 */