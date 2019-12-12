package com.imooc.utils;

import java.util.Random;

/**
 * Created by 兰泽平
 * 2019
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    //多线程的时候订单号可能重复,所以需要加上synchronized
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}