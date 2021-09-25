import java.time.*;
public class Util{
	public static ZoneOffset getZoneOffset(){
		LocalDateTime now = LocalDateTime.now();
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		ZoneOffset zoneOffSet = zone.getRules().getOffset(now);
		return zoneOffSet;
	}
}