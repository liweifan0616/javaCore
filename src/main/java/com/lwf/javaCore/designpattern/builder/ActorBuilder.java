/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.builder;

/**
 * @author liweifan
 * @version $Id: ActorBuilder, v 0.1 2018/3/19 上午11:09 liweifan Exp $
 */
public abstract class ActorBuilder {
    protected static Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    //工厂方法，返回一个完整的游戏角色对象

//    public Actor createActor()
//
//    {
//        return actor;
//    }

    public static Actor construct(ActorBuilder ab) {
        ab.buildType();

        ab.buildSex();

        ab.buildFace();

        ab.buildCostume();

        ab.buildHairstyle();

        return actor;
    }
}