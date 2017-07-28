package com.xulj.common;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @Author xulj
 * @Description:
 * @Date: Created in 14:13 2017/7/28.
 */
public class Entity implements Serializable {

    private static final long serialVersionUID = -2874235891466454007L;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}