package api;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


/**
 * 日期工具类
 *
 * @author yangsongbo
 * @since 3.0
 */
public final class DateUtil {

    /**
     * 日期格式 yyyy-MM-dd
     */
    public static final String STAND_DATE_FORMAT = "yyyy-MM-dd";
    /**
     * 时间格式 HH:mm:ss
     */
    public static final String STAND_TIME_FORMAT = "HH:mm:ss";
    /**
     * 时间格式 yyyy-MM-dd HH:mm:ss
     */
    public static final String STAND_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式 yyyyMMdd
     */
    public static final String DATE_FORMAT_NO_SEPARATOR = "yyyyMMdd";
    /**
     * 时间格式 HHmmss
     */
    public static final String TIME_FORMAT_NO_SEPARATOR = "HHmmss";
    /**
     * 时间格式 yyyyMMddHHmmss
     */
    public static final String TIMESTAMP_FORMAT_NO_SEPARATOR = "yyyyMMddHHmmss";

    /**
     * 时间戳 "00:00:00"后缀
     */
    public static final String TIMESTAMP_ZERO_SUFFIX = " 00:00:00";

    /**
     * 时间戳 "23:59:59"后缀
     */
    public static final String TIMESTAMP_END_SUFFIX = " 23:59:59";


    /**
     * 获取int类型的当前日期
     *
     * @return
     */
    public static int getCurDateInt() {
        return Integer.valueOf(getCurDateStr(DATE_FORMAT_NO_SEPARATOR));
    }


    /**
     * 得到值为当前时间的Timestamp类
     *
     * @return
     */
    public static Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }


    /**
     * 获取系统当前日期
     *
     * @return java.util.Date的系统日期
     */
    public static java.util.Date getCurUtilDate() {
        return new java.util.Date(System.currentTimeMillis());
    }

    /**
     * 返回当前日期
     *
     * @return
     */
    public static Date getCurSqlDate() {
        return new java.sql.Date(System.currentTimeMillis());
    }

    /**
     * 返回当前的系统时间
     * </p>
     * HH:mm:ss 格式
     *
     * @return
     */
    public static String getCurTimeString() {
        return getCurTimeString(STAND_TIME_FORMAT);
    }

    /**
     * 获取当前系统时间
     * </p>
     * 默认返回 HH:mm:ss 格式
     *
     * @return
     */
    public static String getCurTimeString(final String format) {
        if (format == null || "".equals(format)) {
            return new SimpleDateFormat(format, Locale.CHINESE).format(System.currentTimeMillis());
        } else {
            return new SimpleDateFormat(STAND_TIME_FORMAT, Locale.CHINESE).format(System.currentTimeMillis()); // $NON-NLS-1$
        }
    }

    /**
     * Timestamp 转String
     * </p>
     * 默认返回 yyyy-MM-dd HH:mm:ss 格式
     *
     * @return
     */
    public static String timestampToString(final String format, Timestamp time) {
        if (time == null) {
            return null;
        }
        if (format == null || "".equals(format)) {
            return new SimpleDateFormat(STAND_DATE_TIME_FORMAT, Locale.CHINESE).format(time);
        } else {
            return new SimpleDateFormat(format, Locale.CHINESE).format(time);
        }
    }

    /**
     * java.util.Date 转 String
     * </p>
     * 默认返回 yyyy-MM-dd 格式
     *
     * @return
     */
    public static String utilDateToString(final String format, java.util.Date date) {
        if (date == null)
            return null;

        if (format == null || "".equals(format)) {
            return new SimpleDateFormat(STAND_DATE_FORMAT, Locale.CHINESE).format(date); //$NON-NLS-1$
        } else {
            return new SimpleDateFormat(format, Locale.CHINESE).format(date);
        }
    }

    /**
     * java.sql.Date 转 String
     * </p>
     * 默认返回 yyyy-MM-dd 格式
     *
     * @return
     */
    public static String sqlDateToString(final String format, java.sql.Date date) {
        if (date == null)
            return null;

        if (format == null || "".equals(format)) {
            return new SimpleDateFormat(STAND_DATE_FORMAT, Locale.CHINESE).format(date); //$NON-NLS-1$
        } else {
            return new SimpleDateFormat(format, Locale.CHINESE).format(date);
        }
    }


    /**
     * 获取当前系统日期字符串
     * </p>
     * 返回 yyyy-MM-dd 格式
     *
     * @return
     */
    public static String getCurDateStr() {
        return getCurDateStr(STAND_DATE_FORMAT);
    }


    /**
     * 获取当前系统日期字符串
     * </p>
     * 返回 yyyyMMdd 格式
     *
     * @return
     */
    public static String getCurDate() {
        return getCurDateStr(DATE_FORMAT_NO_SEPARATOR);
    }

    /**
     * 获取当前系统日期字符串
     * </p>
     * 默认返回 yyyy-MM-dd 格式
     *
     * @return
     */
    public static String getCurDateStr(final String format) {
        if (format == null || "".equals(format)) {
            return new SimpleDateFormat(STAND_DATE_FORMAT, Locale.CHINESE).format(System.currentTimeMillis());
        } else {
            return new SimpleDateFormat(format, Locale.CHINESE).format(System.currentTimeMillis());
        }
    }


    /**
     * 获取当前系统时间 小时数, 返回字符串(HH)
     *
     * @return
     */
    public static int getCurHourOfDay() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 获取当前系统时间分钟数, 返回字符串(mm)
     *
     * @return
     */
    public static int getCurMinute() {
        return Calendar.getInstance().get(Calendar.MINUTE);
    }

    /**
     * 获取当前系统时间秒数, 返回字符串(ss)
     *
     * @return
     */
    public static int getCurSecond() {
        return Calendar.getInstance().get(Calendar.SECOND);
    }


    /**
     * String 转 java.util.date
     *
     * @param data
     * @param format
     * @return
     */
    public static java.util.Date stringToUtilDate(String data, String format) {
        if (data == null || "".equals(data))
            return null;
        try {
            return new java.util.Date(
                    new SimpleDateFormat(format, Locale.CHINESE).parse(data).getTime());
        } catch (ParseException e) {
            return null;
        }

    }

    /**
     * String 转 Timestamp
     *
     * @param timestamp
     * @return
     * @throws Exception
     */
    public static Timestamp stringToTimestamp(final String timestamp)
            throws Exception {
        return stringToTimestamp(timestamp, null);
    }


    /**
     * String 转 Timestamp
     *
     * @param timestamp
     * @return
     * @throws Exception
     */
    public static Timestamp stringToTimestamp(final String timestamp, String format) {
        if (format == null || "".equals(format))
            format = STAND_DATE_TIME_FORMAT;
        if (timestamp == null || "".equals(timestamp))
            return null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            java.util.Date timeDate = sdf.parse(timestamp);
            return new Timestamp(timeDate.getTime());
        } catch (ParseException e) {
            return null;
        }
    }


    /**
     * 获取Time
     *
     * @return
     */
    public static Time getTime(Timestamp time) {
        if (time == null)
            return null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time.getTime());
        return new Time(calendar.getTime().getTime());
    }

    /**
     * 比较两个日期
     * </p>
     * 两个日期都将转换为 yyyyMMdd格式，然后通过比较字符串确定日期大小
     *
     * @param date1
     * @param date2
     * @return date1 > date2  return 1
     * date1 < date2  return -1
     * date1 == date2 retrn 0
     * @
     */
    public static int compareTwoDates(java.util.Date date1, java.util.Date date2) {

        if (date1 == null) {
            return date2 == null ? 0 : -1;
        } else {
            if (date2 == null) {
                return 1;
            } else {
                String strDate1 = utilDateToString(DATE_FORMAT_NO_SEPARATOR, date1);
                String strDate2 = utilDateToString(DATE_FORMAT_NO_SEPARATOR, date2);
                int intRet = strDate1.compareTo(strDate2);
                if (intRet > 0)
                    return 1;
                else if (intRet == 0)
                    return 0;
                else
                    return -1;
            }
        }

    }


    /**
     * Timestamp 转 java.sql.Date
     *
     * @param timestamp
     * @return
     */
    public static java.sql.Date timestampToSqlDate(Timestamp timestamp) {
        if (timestamp == null)
            return null;

        return new Date(timestamp.getTime());
    }


    /**
     * java.sql.Date 转 Timestamp  时间部分为  00:00:00
     */
    public static Timestamp sqlDate2Timestamp(java.sql.Date date) throws Exception {
        if (date == null)
            return null;
        return new Timestamp(date.getTime());
    }


    /**
     * java.util.Date 转 Timestamp
     *
     * @param date
     * @return
     * @throws Exception
     */
    public static Timestamp utilDate2Timestamp(java.util.Date date) {
        if (date == null)
            return null;
        return new Timestamp(date.getTime());
    }

    /**
     * java.sql.Date 转 Timestamp  时间部分为  00:00:00
     */
    public static java.sql.Date utilDate2SqlDate(java.util.Date date) {
        if (date == null)
            return null;
        return new java.sql.Date(date.getTime());
    }


    /**
     * java.sql.Date 转 Integer (8位数字的日期)
     *
     * @param date
     * @return
     * @throws Exception
     */
    public static Integer sqlDate2Integer(java.sql.Date date) {
        return utilDate2Integer(date);
    }


    /**
     * java.util.Date 转 Integer (8位数字的日期)
     *
     * @param date
     * @return
     * @throws Exception
     */
    public static Integer utilDate2Integer(java.util.Date date) {
        if (date == null)
            return null;

        String dateStr = utilDateToString(DATE_FORMAT_NO_SEPARATOR, date);

        return (dateStr != null && !"".equals(dateStr)) ? Integer.valueOf(dateStr) : null;
    }


    /**
     * 计算taget是从begin开始计算的第几天
     * </p>
     * begin为第1天
     */
    public static long whichDay(java.util.Date begin, java.util.Date target) throws Exception {
        if (begin == null || target == null)
            return 0;


        SimpleDateFormat sdf = new SimpleDateFormat(STAND_DATE_FORMAT);
        begin = sdf.parse(sdf.format(begin));
        target = sdf.parse(sdf.format(target));

        long between = (target.getTime() - begin.getTime()) / (3600 * 24 * 1000);
        long remainder = (target.getTime() - begin.getTime()) % (3600 * 24 * 1000);

        long inc = remainder > 0 ? 2L : 1L;

        return Math.abs(between) + inc;

    }

    /**
     * 计算时间差，返回天数
     *
     * @return
     */
    public static long daysBetweenWithTime(Timestamp time1, Timestamp time2) {
        if (time1 == null || time2 == null)
            return -1;
        long between = (time1.getTime() - time2.getTime()) / (3600 * 24 * 1000);
        long remainder = (time1.getTime() - time2.getTime()) % (3600 * 24 * 1000);
        if (Math.abs(remainder) > 0) {
            return Math.abs(between) + 1;
        }
        return Math.abs(between);
    }

    public static long daysBetweenWithDate(java.util.Date smdate, java.util.Date bdate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        smdate = sdf.parse(sdf.format(smdate));
        bdate = sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Math.abs(between_days);
    }


//    public static void main(String[] args) throws Exception {
//		
//    	System.out.println(daysBetweenWithDate(DateUtil.stringToUtilDate("20170909", "yyyyMMdd"), getCurUtilDate()));
//	}

    /**
     * date1 - date2
     *
     * @param date1
     * @param date2
     * @return
     * @throws Exception
     */
    public static long subtract(java.util.Date date1, java.util.Date date2) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date1 = sdf.parse(sdf.format(date1));
            date2 = sdf.parse(sdf.format(date2));
        } catch (ParseException e) {
            return -999999;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        long time1 = cal.getTimeInMillis();
        cal.setTime(date2);
        long time2 = cal.getTimeInMillis();
        long between_days = (time1 - time2) / (1000 * 3600 * 24);

        return between_days;
    }


    /**
     * 计算时间差，返回小时数
     */
    public static long hoursBetween(java.util.Date date1, java.util.Date date2) {
        long between = (date1.getTime() - date2.getTime()) / (3600 * 1000);
        long remainder = (date1.getTime() - date2.getTime()) % (3600 * 1000);

        if (Math.abs(remainder) > 0) {
            return Math.abs(between) + 1;
        }
        return Math.abs(between);
    }


    /**
     * 计算时间差，返回毫秒数
     *
     * @param time1
     * @param time2
     * @return
     */
    public static long millisecondsBetween(Timestamp time1, Timestamp time2) {
        long between = (time1.getTime() - time2.getTime());
        return Math.abs(between);
    }

    /**
     * 计算时间差，返回秒数
     */
    public static long secondsBetween(java.util.Date date1, java.util.Date date2) {
        long between = (date1.getTime() - date2.getTime()) / 1000L;
        long remainder = (date1.getTime() - date2.getTime()) % 1000L;

        if (Math.abs(remainder) > 0) {
            return Math.abs(between) + 1;
        }
        return Math.abs(between);
    }


    /**
     * 计算时间差，返回年数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static long yearsBetween(Date date1, Date date2) {
        Calendar str1 = Calendar.getInstance();
        str1.setTimeInMillis(date1.getTime());
        Calendar str2 = Calendar.getInstance();
        str2.setTimeInMillis(date2.getTime());
        return Math.abs(str1.get(Calendar.YEAR) - str2.get(Calendar.YEAR));
    }


    /**
     * 计算时间差   返回 HH:mm:ss格式
     *
     * @param time1
     * @param time2
     * @return
     */
    public static String timesBetween(Timestamp time1, Timestamp time2) {
        if (time1 == null || time2 == null) {
            return null;
        }
        long between = (time1.getTime() - time2.getTime());
        between = Math.abs(between);
        long h = between / (1000 * 60 * 60);
        long m = (between % (1000 * 60 * 60)) / (1000 * 60);
        long s = (between % (1000 * 60)) / 1000;

        return (h < 10 ? ("0" + h) : h) + ":" + (m < 10 ? ("0" + m) : m) + ":" + (s < 10 ? ("0" + s) : s);
    }


    /**
     * 获取 “年”
     */
    public static int getYear(java.util.Date date) {
        return getByCalendar(date, Calendar.YEAR);
    }


    /**
     * 获取 “月”
     */
    public static int getMonth(java.util.Date date) {
        // Month值为 0-11   ，因此需要加1
        return getByCalendar(date, Calendar.MONTH) + 1;
    }

    /**
     * 获取 “日”
     *
     * @param date
     * @return
     */
    public static int getDay(java.util.Date date) {
        return getByCalendar(date, Calendar.DAY_OF_MONTH);
    }


    /**
     * 获取 “周”
     *
     * @param date
     * @return 周一：1、周二：2、周三：3、周四：4、周五：5、周六：6、周日：7
     */
    public static int getWeek(java.util.Date date) {
        int week = getByCalendar(date, Calendar.DAY_OF_WEEK);
        return week == 1 ? 7 : week - 1;

    }

    /**
     * 获取 “时”,24小时制
     *
     * @param date
     * @return
     */
    public static int getHourOfDay(java.util.Date date) {
        int hour = getByCalendar(date, Calendar.HOUR_OF_DAY);
        return hour;

    }


    /**
     * 操作Calendar类，根据参数时间戳返回值
     *
     * @param date
     * @param field
     * @return
     */
    private static int getByCalendar(java.util.Date date, int field) {
        if (date == null) {
            throw new NullPointerException();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTime());
        return calendar.get(field);
    }

    /**
     * String 转 java.sql.date
     *
     * @param data
     * @param format
     * @return
     */
    public static java.sql.Date stringToSqlDate(String data, String format) {
        if (data == null || "".equals(data))
            return null;
        try {
            return new java.sql.Date(
                    new SimpleDateFormat(format, Locale.CHINESE).parse(data).getTime());
        } catch (ParseException e) {
            return null;
        }

    }


    public static java.util.Date getDayBegin(java.util.Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar.getTime();
    }

    public static java.util.Date getDayEnd(java.util.Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.SECOND, -1);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();

    }

    /**
     * 根据生日获取年龄
     *
     * @param birthday
     * @return
     */
    public static int getAgeByBirthday(java.util.Date birthday) {
        Calendar cal = Calendar.getInstance();

        if (cal.before(birthday)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }

        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH) + 1;
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);

        cal.setTime(birthday);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH) + 1;
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                // monthNow==monthBirth
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                // monthNow>monthBirth
                age--;
            }
        }
        return age;
    }

    /**
     * 返回上个月的第一天
     *
     * @return Timestamp
     */
    public static Timestamp getPreMonthFirstDay() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return new Timestamp(c.getTime().getTime());
    }

    /**
     * 返回上个月的最后一天
     *
     * @return Timestamp
     */
    public static Timestamp getPreMonthLastDay() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 0);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.add(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.SECOND, -1);
        c.set(Calendar.MILLISECOND, 999);
        return new Timestamp(c.getTime().getTime());
    }

    /**
     * 返回指定日期的月份的第一天
     *
     * @param date
     * @param format
     * @return
     */
    public static Timestamp getMonthBegin(String date, String format) {
        Calendar c = Calendar.getInstance();
        c.setTime(stringToUtilDate(date, format));
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return new Timestamp(c.getTime().getTime());
    }

    /**
     * 返回指定日期的月份的最后一天
     *
     * @param date
     * @param format
     * @return
     */
    public static Timestamp getMonthEnd(String date, String format) {
        Calendar c = Calendar.getInstance();
        c.setTime(stringToUtilDate(date, format));
        c.add(Calendar.MONTH, 1);
        c.set(Calendar.DAY_OF_MONTH, 0);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.add(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.SECOND, -1);
        c.set(Calendar.MILLISECOND, 999);
        return new Timestamp(c.getTime().getTime());
    }

    public static Timestamp getDayBegin(String date, String format) {
        return new Timestamp(getDayBegin(stringToUtilDate(date, format)).getTime());
    }


    public static Timestamp getDayEnd(String date, String format) {
        return new Timestamp(getDayEnd(stringToUtilDate(date, format)).getTime());

    }

    public static Timestamp preWeekMonday() {
        Calendar mondayWeekCal = Calendar.getInstance();
        int dayOfWeek = mondayWeekCal.get(Calendar.DAY_OF_WEEK) - 1;
        int offset = 1 - dayOfWeek;
        mondayWeekCal.add(Calendar.DATE, offset - 7);
        return new Timestamp(mondayWeekCal.getTime().getTime());
    }

    public static Timestamp preWeekSunday() {
        Calendar mondayWeekCal = Calendar.getInstance();
        Calendar sunWeekCal = Calendar.getInstance();
        int dayOfWeek = mondayWeekCal.get(Calendar.DAY_OF_WEEK) - 1;
        int offset = 7 - dayOfWeek;
        sunWeekCal.add(Calendar.DATE, offset - 7);
        return new Timestamp(sunWeekCal.getTime().getTime());
    }

    public static Timestamp lastWeek(java.util.Date date, int inc) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, inc);
        return new Timestamp(calendar.getTime().getTime());

    }

    /**
     * 日期获取星期几
     *
     * @param dateStr yyyyMMdd
     * @return
     */
    public static String dateStr2ChinaWeek(String dateStr, boolean isXingQi) throws ParseException {
        if (dateStr == null) {
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT_NO_SEPARATOR);
        java.util.Date date = format.parse(dateStr);
        return date2ChinaWeek(date, isXingQi);
    }

    public static String date2ChinaWeek(java.util.Date date, boolean isXingQi) {
        if (date == null) {
            return null;
        }

        int week = getWeek(date);
        String[] chinaWeeks = null;
        if (isXingQi) {
            chinaWeeks = new String[]{"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        } else {
            chinaWeeks = new String[]{"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
        }


        return chinaWeeks[week - 1];
    }

}
