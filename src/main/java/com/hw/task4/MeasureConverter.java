package com.hw.task4;

public class MeasureConverter {
    public static Double convert(double valueIn,MeasureUnits unitIn,double valueOut,MeasureUnits unitOut){
        return null;
    }
    public static Double getMM(double valueIn,MeasureUnits unitIn){
        return switch (unitIn) {
            case mm -> valueIn;
            case sm -> valueIn * 10;
            case dm -> valueIn * 100;
            case m -> valueIn * 1000;
            case km -> valueIn * 1000000;
        };
    }
}
