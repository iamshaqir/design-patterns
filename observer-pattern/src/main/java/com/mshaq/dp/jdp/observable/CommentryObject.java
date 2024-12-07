package com.mshaq.dp.jdp.observable;

import com.mshaq.dp.jdp.observer.Observer;

import java.util.List;

public class CommentryObject implements Commentary, Subject {

    private final List<Observer> observers;
    private String description;

    private final String subjectDetails;

    public CommentryObject(List<Observer> observer, String subjectDetails) {
        this.observers = observer;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println();
        for (Observer observer : observers) {
            observer.update(description);
        }
    }

    @Override
    public void setDesc(String desc) {
        this.description = desc;
        notifyObserver();
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
