/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liweifan
 * @version $Id: OuterUser, v 0.1 2018/3/23 下午3:06 liweifan Exp $
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map<String, String> getUserBaseInfo() {
        HashMap<String,String> baseInfoMap = new HashMap<String,String>();
        baseInfoMap.put("userName", "B公司小吕");
        baseInfoMap.put("mobileNumber", "13874896584");
        return baseInfoMap;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        HashMap<String,String> officeInfoMap = new HashMap<String,String>();
        officeInfoMap.put("officeTelNumber", "020-8888888");
        officeInfoMap.put("jobPosition", "开发小组长");
        return officeInfoMap;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        HashMap<String,String> homeInfoMap = new HashMap<String,String>();
        homeInfoMap.put("homeTelNumber", "0734-88888888");
        homeInfoMap.put("homeAddress", "湖南省长沙市xxx");
        return homeInfoMap;

    }
}