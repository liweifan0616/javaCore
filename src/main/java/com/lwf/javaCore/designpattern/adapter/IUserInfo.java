/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.adapter;

/**
 * 这是A公司用户管理模块的用户接口
 * @author liweifan
 * @version $Id: IUserInfo, v 0.1 2018/3/23 下午3:03 liweifan Exp $
 */
public interface IUserInfo {
    // 获得用户姓名
    public String getUserName();
    // 获得家庭地址
    public String getHomeAddress();
    // 手机号码，这个太重要，手机泛滥呀
    public String getMobileNumber();
    // 办公电话，一般式座机
    public String getOfficeTelNumber();
    // 这个人的职位是啥
    public String getJobPosition();
    // 获得家庭电话，这个有点缺德，我是不喜欢打家庭电话讨论工作
    public String getHomeTelNumber();
}