/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.mediator;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/3/22 上午11:33 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {
        // 实例化房屋中介
        Mediator mediator = new HouseMediator();

        Person landlordA, landlordB, renter;
        landlordA = new Landlord(mediator, "房东李");
        landlordB = new Landlord(mediator, "房东黎");

        renter = new Renter(mediator, "小吕");

        // 房东注册中介
        mediator.registerLandlord(landlordA);

        mediator.registerLandlord(landlordB);
        // 求租者注册中介
        mediator.registerRenter(renter);

        // 求租者 发送求租消息
        renter.sendMessage("在天河公园附近租套房子，价格1000元左右一个月");
        System.out.println("--------------------------");
        // 房东A 发送房屋出租消息
        landlordB.sendMessage("天河公园学院站三巷27号四楼有一房一厅出租  1200/月  光线好 近公交站");
    }
}