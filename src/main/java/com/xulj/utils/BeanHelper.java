package com.xulj.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/**
 * @Author xulj
 * @Description: 将request中的参数复制到业务bean中
 * @Date: Created in 11:42 2017/7/28.
 */
public class BeanHelper {

    private static final Logger logger = Logger.getLogger(BeanHelper.class);

    /**
     * @param content
     * @param clazz
     * @Description:
     * @Author: xulj
     * @Time: 14:06 2017/7/28
     */
    public static <T> T parseJson(String content, Class<T> clazz) throws Exception {
        if (StringUtils.isBlank(content)) {
            return null;
        }
        try {
//            logger.info("将json参数转化为JavaBean,class:[{}]，content:[{}]", clazz.getSimpleName(), content);
            logger.info("\"将json参数转化为JavaBean,class:[{}]，content:[{}]\"," + clazz.getSimpleName() + "," + content);
            T t = JSONObject.parseObject(content, clazz);
            return t;
        } catch (Exception e) {
            logger.error("将json参数转化为JavaBean异常", e);
            throw e;
        }
    }
}
