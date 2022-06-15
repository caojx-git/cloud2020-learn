import java.time.ZonedDateTime;

/**
 * @author caojx created on 2022/6/14 11:51 AM
 */
public class ZonedDateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);  // 2022-06-14T11:51:59.906+08:00[Asia/Shanghai]
        // ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
        // System.out.println(zny);
    }
}
