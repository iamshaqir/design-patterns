package com.mshaq.dp.hfdp.behaviours;

import com.mshaq.dp.hfdp.behaviours.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
