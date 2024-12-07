package com.mshaq.dp.cc.observable;

import com.mshaq.dp.cc.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    List<NotificationAlertObserver> stockObservables = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        stockObservables.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        stockObservables.remove(notificationAlertObserver);
    }

    @Override
    public void sendNotification() {
        for (NotificationAlertObserver observer : stockObservables) {
            observer.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if (stockCount == 0) {
            sendNotification();
        }
        stockCount = stockCount + stock;
    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
