package com.skrebtsov.eugeney.observer;

import android.util.Log;

public class UserDisplay implements Observer {
    Subject observable;
    private String name;
    private String first;

    public UserDisplay(Subject observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }


    public void display() {
        Log.d("Observer: UserDisplay", name + " " + first);
    }

    @Override
    public void update(String name, String first) {
        this.name = name;
        this.first = first;
        display();
    }
}
