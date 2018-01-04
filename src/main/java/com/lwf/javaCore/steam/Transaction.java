/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.steam;

/**
 * @author liweifan
 * @version $Id: Transaction, v 0.1 2018/1/3 下午5:35 liweifan Exp $
 */
public class Transaction {
    private final int id;
    private final Integer value;
    private final Type type;

    public Transaction(int id, Integer value, Type type) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public enum Type {
        A, B, C, D, GEOCERY
    }

    public int getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }
}