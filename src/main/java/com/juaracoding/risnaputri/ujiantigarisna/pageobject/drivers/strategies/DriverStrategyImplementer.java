package com.juaracoding.risnaputri.ujiantigarisna.pageobject.drivers.strategies;

import com.juaracoding.risnaputri.ujiantigarisna.pageobject.utils.Constants;

public class DriverStrategyImplementer {
    public static Firefox chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }
    }
}