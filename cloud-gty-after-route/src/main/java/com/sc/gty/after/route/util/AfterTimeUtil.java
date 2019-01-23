package com.sc.gty.after.route.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.after.route.util、
 * @email: cy880708@163.com
 * @date: 2019/1/22 下午6:35
 * @mofified By:
 */
public class AfterTimeUtil {

    public static String getMinTime() {
        String minTime = ZonedDateTime.now().minusHours(1).format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        return minTime;
    }

    public static void main(String[] args) {
        System.out.println(getMinTime());
    }


}
