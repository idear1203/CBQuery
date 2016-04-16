package cn.net.idear.util;

import java.util.Date;

/**
 * Created by wangdongwei on 4/17/16.
 */
public class Utility {
    private final static double AVERAGE_MILLIS_PER_MONTH = 365.24 * 24 * 60 * 60 * 1000 / 12;

    public static double monthsBetween(Date d1, Date d2) {
        return (d2.getTime() - d1.getTime()) / AVERAGE_MILLIS_PER_MONTH;
    }
}
