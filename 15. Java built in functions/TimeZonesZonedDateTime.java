import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesZonedDateTime {
    public static void displayTime(String zone) {
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println(zone + ": " + zdt.toLocalTime());
    }

    public static void main(String[] args) {
        displayTime("GMT");
        displayTime("Asia/Kolkata"); // IST
        displayTime("America/Los_Angeles"); // PST
    }
}
