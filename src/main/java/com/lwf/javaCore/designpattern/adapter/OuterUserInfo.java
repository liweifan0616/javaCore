/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.adapter;

import java.util.Map;

/**
 * @author liweifan
 * @version $Id: OuterUserInfo, v 0.1 2018/3/23 下午3:06 liweifan Exp $
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map<String,String> baseInfoMap = super.getUserBaseInfo();
    private Map<String,String> officeInfoMap = super.getUserOfficeInfo();
    private Map<String,String> homeInfoMap = super.getUserHomeInfo();

    /**
     * 用户姓名
     */
    @Override
    public String getUserName() {
        String userName = baseInfoMap.get("userName");
        // System.out.println("获得外系统用户姓名："+userName);
        return userName;
    }

    /**
     * 手机号码
     */
    @Override
    public String getMobileNumber() {
        String mobileNumber = baseInfoMap.get("mobileNumber");
        // System.out.println("获得外系统用户手机号码："+mobileNumber);
        return mobileNumber;
    }

    /**
     * 办公电话
     */
    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = officeInfoMap.get("officeTelNumber");
        // System.out.println("获得外系统用户办公号码："+officeTelNumber);
        return officeTelNumber;
    }

    /**
     * 工作职位
     */
    @Override
    public String getJobPosition() {
        String jobPosition = officeInfoMap.get("jobPosition");
        // System.out.println("获得外系统用户工作职位："+jobPosition);
        return jobPosition;
    }

    /**
     * 家庭电话
     */
    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = homeInfoMap.get("homeTelNumber");
        // System.out.println("获得外系统用户家庭电话："+homeTelNumber);
        return homeTelNumber;
    }

    /**
     * 家庭地址
     */
    @Override
    public String getHomeAddress() {
        String homeAddress = homeInfoMap.get("homeAddress");
        // System.out.println("获得外系统用户家庭地址："+homeAddress);
        return homeAddress;
    }
}