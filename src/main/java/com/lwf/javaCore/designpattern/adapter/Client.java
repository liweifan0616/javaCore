/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.adapter;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/3/23 下午3:10 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {
        OuterUserInfo outerUserInfo = new OuterUserInfo();
        System.out.println("A公司用户系统开始调用B公司用户系统用户信息.....\n");
        System.out.println("获得外系统用户姓名："+outerUserInfo.getUserName());
        System.out.println("获得外系统用户手机号码："+outerUserInfo.getMobileNumber());
        System.out.println("获得外系统用户办公号码："+outerUserInfo.getOfficeTelNumber());
        System.out.println("获得外系统用户工作职位："+outerUserInfo.getJobPosition());
        System.out.println("获得外系统用户家庭电话："+outerUserInfo.getHomeTelNumber());
        System.out.println("获得外系统用户家庭地址："+outerUserInfo.getHomeAddress());
        System.out.println("\nA公司用户系统已成功调用B公司用户系统.....");
    }
}