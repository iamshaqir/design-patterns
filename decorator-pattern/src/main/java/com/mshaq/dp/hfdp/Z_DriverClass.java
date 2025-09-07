package com.mshaq.dp.hfdp;

public class Z_DriverClass {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(new Mocha(new Whip(darkRoast)));
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);

        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

    }
}
