/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.adapter;

import java.util.Map;

/**
 * @author liweifan
 * @version $Id: IOuterUser, v 0.1 2018/3/23 下午3:04 liweifan Exp $
 */
public interface IOuterUser {
    //基本信息，比如名称，性别，手机号码了等
    public Map<String,String> getUserBaseInfo();
    //工作区域信息
    public Map<String,String> getUserOfficeInfo();
    //用户的家庭信息
    public Map<String,String> getUserHomeInfo();
}