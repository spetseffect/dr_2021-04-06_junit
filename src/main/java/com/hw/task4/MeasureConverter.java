package com.hw.task4;

public class MeasureConverter {
    public static Double convert(double valueIn, MeasureUnits unitIn, double valueOut, MeasureUnits unitOut) {
        return null;
    }

    public static Double getMM(double valueIn, MeasureUnits unitIn) {
        return switch (unitIn) {
            case mm -> valueIn;
            case sm -> valueIn * 10;
            case dm -> valueIn * 100;
            case m -> valueIn * 1000;
            case km -> valueIn * 1000000;
        };
    }

    public static Double getSM(double valueIn, MeasureUnits unitIn) {
        return switch (unitIn) {
            case mm -> valueIn / 10;
            case sm -> valueIn;
            case dm -> valueIn * 10;
            case m -> valueIn * 100;
            case km -> valueIn * 100000;
        };
    }

    public static Double getDM(double valueIn, MeasureUnits unitIn) {
        return switch (unitIn) {
            case mm -> valueIn / 100;
            case sm -> valueIn / 10;
            case dm -> valueIn;
            case m -> valueIn * 10;
            case km -> valueIn * 10000;
        };
    }

}
