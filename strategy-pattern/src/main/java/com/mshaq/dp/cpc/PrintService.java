package com.mshaq.dp.cpc;


import com.mshaq.dp.cpc.strategy.OrderPrinter;

import java.util.LinkedList;

//Context 
public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
