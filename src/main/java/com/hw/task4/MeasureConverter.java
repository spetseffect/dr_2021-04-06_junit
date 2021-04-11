package com.hw.task4;

public class MeasureConverter {
    public static Double convert(double valueIn, MeasureUnits unitIn, MeasureUnits unitOut) {
        return switch (unitOut) {
            case mm -> getMM(valueIn, unitIn);
            case sm -> getSM(valueIn, unitIn);
            case dm -> getDM(valueIn, unitIn);
            case  m -> getM(valueIn, unitIn);
            case km -> getKM(valueIn, unitIn);
        };
    }
    public static Double getMM(double valueIn, MeasureUnits unitIn) {
        return switch (unitIn) {
            case mm -> valueIn;
            case sm -> valueIn * 10;
            case dm -> valueIn * 100;
            case  m -> valueIn * 1000;
            case km -> valueIn * 1000000;
        };
    }
    public static Double getSM(double valueIn, MeasureUnits unitIn) {
        return switch (unitIn) {
            case mm -> valueIn / 10;
            case sm -> valueIn;
            case dm -> valueIn * 10;
            case  m -> valueIn * 100;
            case km -> valueIn * 100000;
        };
    }
    public static Double getDM(double valueIn, MeasureUnits unitIn) {
        return switch (unitIn) {
            case mm -> valueIn / 100;
            case sm -> valueIn / 10;
            case dm -> valueIn;
            case  m -> valueIn * 10;
            case km -> valueIn * 10000;
        };
    }
    public static Double getM(double valueIn, MeasureUnits unitIn) {
        return switch (unitIn) {
            case mm -> valueIn / 1000;
            case sm -> valueIn / 100;
            case dm -> valueIn / 10;
            case  m -> valueIn;
            case km -> valueIn * 1000;
        };
    }
    public static Double getKM(double valueIn, MeasureUnits unitIn) {
        return switch (unitIn) {
            case mm -> valueIn / 1000000;
            case sm -> valueIn / 100000;
            case dm -> valueIn / 10000;
            case  m -> valueIn / 1000;
            case km -> valueIn;
        };
    }
}
