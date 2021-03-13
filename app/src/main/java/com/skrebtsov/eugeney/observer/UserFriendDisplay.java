package com.skrebtsov.eugeney.observer;

import android.util.Log;

import java.util.Observable;

public class UserFriendDisplay implements Observer {
    Subject observable;
    private String name;
    private String first;

    public UserFriendDisplay(Subject observable){
        this.observable = observable;
        observable.registerObserver(this);
    }

    public void display(){
        Log.d("Observer: UserFriendDisplay", name + " " + first);
    }

    @Override
    public void update(String name, String first) {
        this.name = name;
        this.first = first;
        display();
    }
}
