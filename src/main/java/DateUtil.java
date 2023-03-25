import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    
    //현재 날짜 String 구하기
    public static String getToday() {

        SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String nowStr = format.format(now);

        return nowStr;
    }
    
    //현재 날짜 Date 구하기
    public static Date getTodayNoFormat(){
        Date now = new Date();
        return now;
    }

    //현재 날짜로부터 +n일의 날짜 구하기
    public static Date getPlusDateFromNow(Date date, int plusDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, plusDay);
        Date plusDate = calendar.getTime();
        return plusDate;
    }

    public static Date getDateBasedOn12AM(Date date, int plusDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, plusDate);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date plusDateMidnight = calendar.getTime();
        return plusDateMidnight;
    }

    public static void main(String[] args) {

        String nowStr = getToday();
        System.out.println("nowStr with format = " + nowStr);

        Date now = getTodayNoFormat();
        System.out.println("now with no format = " + now);

        Date plusDate = getPlusDateFromNow(now, 2);
        System.out.println("plusDate = " + plusDate);

        Date plusDateMidnight = getDateBasedOn12AM(now, 2);
        System.out.println("plusDateMidnight = " + plusDateMidnight);
    }
}
