package design;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int noOfPosts;

    public int getNoOfPosts(){
        return noOfPosts;
    }

    public void setNoOfPosts(int noOfPosts){
        this.noOfPosts = noOfPosts;
        notifyAllObservers();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    private void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
