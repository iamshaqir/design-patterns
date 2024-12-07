package com.mshaq.dp.cc.observer;

import com.mshaq.dp.cc.observable.StockObservable;

public class MailAlertObserver implements NotificationAlertObserver {

    private final StockObservable stockObservable;
    private final String email;

    public MailAlertObserver(StockObservable stockObservable, String email) {
        this.stockObservable = stockObservable;
        this.email = email;
    }

    @Override
    public void update() {
        sendMail();
    }

    private void sendMail() {
        System.out.println("Sending mail notification to " + this.email + ", Stock count : " + stockObservable.getStock());
    }
}
