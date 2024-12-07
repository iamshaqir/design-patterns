package com.mshaq.dp.cpc.strategy;

import com.mshaq.dp.cpc.Order;

import java.util.Collection;

//Strategy
public interface OrderPrinter {

    void print(Collection<Order> orders);
}
