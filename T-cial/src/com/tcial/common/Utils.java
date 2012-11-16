package com.tcial.common;

import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * ユーティリティークラス
 */
public class Utils {
    
    public static boolean isEmpty(Object o) {
        return o == null || "".equals(o) ? true : false;
    }

    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Map o) {
        return o == null || o.size() == 0 ? true : false;
    }

    public static boolean isEmpty(Object[] o) {
        return o == null || o.length == 0 ? true : false;
    }

    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(List l) {
        return l == null || l.size() == 0 ? true : false;
    }
    
    /**
     * 0からmaxの数値をランダムに取得する。
     * @param max
     * @return
     */
    public static int getRandom(int max) {
        Random r = new Random();
        int random = r.nextInt(max);
        return random;
    }
}
