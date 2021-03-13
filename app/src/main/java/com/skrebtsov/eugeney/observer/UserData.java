package com.skrebtsov.eugeney.observer;

import java.util.ArrayList;
import java.util.Observable;

public class UserData implements Subject {
    private ArrayList observers;
    private String name;
    private String first;

    public UserData() {
        observers = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public String getFirst() {
        return first;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(name, first);
        }
    }
    public void measurementChanged(){
        notifyObservers();
    }
    public void setMeasurements(String name, String first){
        this.name = name;
        this.first = first;
        measurementChanged();
    }
}
