package com.mshaq.dp.cc;

import com.mshaq.dp.cc.strategy.DriveStrategy;
import com.mshaq.dp.cc.strategy.NormalDriveStrategy;
import com.mshaq.dp.cc.strategy.SportsDriveStrategy;

public class ZDriverClass {

    public static void main(String[] args) {
        DriveStrategy sportsDriveStrategy = new SportsDriveStrategy();

        DriveStrategy normalDriveStrategy = new NormalDriveStrategy();

        Vehicle sports = new SportsVehicle(sportsDriveStrategy);
        sports.drive("for Sports Vehicle");

        Vehicle offRoad = new OffRoadVehicle(sportsDriveStrategy);
        offRoad.drive("for Off-road Vehicle");

        Vehicle goods = new GoodsVehicle(normalDriveStrategy);
        goods.drive("for Goods Vehicle");
    }
}
