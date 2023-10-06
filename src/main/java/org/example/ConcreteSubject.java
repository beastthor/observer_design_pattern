package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void setState(String state){
        this.state = state;
        notifyObservers("State changed to " + state);

    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }
}
