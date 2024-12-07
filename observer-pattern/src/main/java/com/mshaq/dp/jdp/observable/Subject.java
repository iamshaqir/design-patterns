package com.mshaq.dp.jdp.observable;

import com.mshaq.dp.jdp.observer.Observer;

public interface Subject {

    void subscribeObserver(Observer observer);

    void unSubscribeObserver(Observer observer);

    void notifyObserver();

    String subjectDetails();
}
