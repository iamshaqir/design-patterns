package com.mshaq.dp.cc.observable;

import com.mshaq.dp.cc.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void sendNotification();

    void setStock(int stock);

    int getStock();
}
