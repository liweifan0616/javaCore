/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.steam;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个流的操作示例
 * @author liweifan
 * @version $Id: Widget, v 0.1 2018/1/3 下午8:23 liweifan Exp $
 */
public class Widget {
    private final Color color;

    private final int weight;

    enum Color {RED, BLACK, BLUE}

    public Widget(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        List<Widget> widgets = new ArrayList<>();
        widgets.add(new Widget(Color.RED, 1));
        widgets.add(new Widget(Color.RED, 3));
        widgets.add(new Widget(Color.BLACK, 3));
        widgets.add(new Widget(Color.BLUE, 4));
        int sum = widgets.stream()
                .filter(w -> w.getColor() == Color.RED)
                .mapToInt(w -> w.getWeight())
                .sum();
        System.out.println(sum);
    }
}