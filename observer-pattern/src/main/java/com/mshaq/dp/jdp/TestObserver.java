package com.mshaq.dp.jdp;

import com.mshaq.dp.jdp.observable.CommentryObject;
import com.mshaq.dp.jdp.observable.Subject;
import com.mshaq.dp.jdp.observer.Observer;
import com.mshaq.dp.jdp.observer.SMSUsers;

import java.util.ArrayList;

public class TestObserver {

    public static void main(String[] args) {

        Subject subject = new CommentryObject(new ArrayList<>(), "Soccer Match [2014AUG24]");
        Observer observer1 = new SMSUsers(subject, "Adam Warner [New York]");
        observer1.subscribe();
        System.out.println();

        Observer observer2 = new SMSUsers(subject, "Tim Ronny [London]");
        observer2.subscribe();
        System.out.println();

        CommentryObject cObject = (CommentryObject) subject;
        cObject.setDesc("Welcome to live Soccer match");
        cObject.setDesc("Current score 0-0");
        System.out.println();

        observer2.unSubscribe();
        System.out.println();

        cObject.setDesc("It’s a goal!!");
        cObject.setDesc("Current score 1-0");
        System.out.println();

        Observer observer3 = new SMSUsers(subject, "Marrie [Paris]");
        observer3.subscribe();
        System.out.println();

        cObject.setDesc("It’s another goal!!");
        cObject.setDesc("Half-time score 2-0");
    }
}
