package com.mshaq.dp.jdp.observer;

import com.mshaq.dp.jdp.observable.Subject;

public class SMSUsers implements Observer {

    private final Subject subject;

    private String description;

    private final String userInfo;

    public SMSUsers(Subject subject, String userInfo) {
        if (subject == null) {
            throw new NullPointerException("No Publisher found.");
        }
        this.userInfo = userInfo;
        this.subject = subject;
    }


    @Override
    public void update(String desc) {
        this.description = desc;
        display();
    }

    private void display() {
        System.out.println("[" + userInfo + "] : " + description);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");
    }
}
