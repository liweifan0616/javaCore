/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.mediator;

/**
 * @author liweifan
 * @version $Id: HouseMediator, v 0.1 2018/3/22 上午11:33 liweifan Exp $
 */
public class HouseMediator extends Mediator {
    @Override
    public void operation(Person person, String message) {

        if (person instanceof Renter) {
            // 将租屋的需求消息传递给 注册了的房东们
            for (Person landlord : landlordList) {
                landlord.getMessage(message);
            }
        } else if (person instanceof Landlord) {
            // 将房东的出租房消息传递给 注册了的 房屋求租者们
            for (Person renter : renterList) {
                renter.getMessage(message);
            }
        }
    }
}