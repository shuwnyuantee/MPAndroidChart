package com.github.mikephil.charting.data;

import com.github.mikephil.charting.charts.ScatterChart;

/**
 * Created by shuwnyuan on 30/10/2017.
 */

public class WaterfallBar {

    public enum Type {
        INCREASE,
        DECREASE,
        TOTAL;
    }

    public WaterfallBar (float yMin, float yMax, Type type, String description) {
        this.yMin = yMin;
        this.yMax = yMax;
        this.type = type;
        this.description = description;
    }

    public final float yMin;
    public final float yMax;
    public final Type type;
    public final String description;
}
