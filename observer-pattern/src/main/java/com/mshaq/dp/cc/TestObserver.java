package com.mshaq.dp.cc;

import com.mshaq.dp.cc.observable.IphoneObservableImpl;
import com.mshaq.dp.cc.observable.StockObservable;
import com.mshaq.dp.cc.observer.MailAlertObserver;
import com.mshaq.dp.cc.observer.NotificationAlertObserver;

public class TestObserver {

    public static void main(String[] args) {

        StockObservable observable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new MailAlertObserver(observable, "xyz@gmail.com");
        observable.add(observer1);
        System.out.println();

        NotificationAlertObserver observer2 = new MailAlertObserver(observable, "abc@gmail.com");
        observable.add(observer2);
        System.out.println();

        NotificationAlertObserver observer3 = new MailAlertObserver(observable, "pqr@gmail.com");
        observable.add(observer3);
        System.out.println();
    }
}
