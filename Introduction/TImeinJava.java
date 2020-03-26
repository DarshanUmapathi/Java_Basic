package Introduction;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

public class TImeinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Things Studied here :
		/*
		 * 1. ChronoLocalDate 
		 * 2. Clock 
		 * 3. Duration
		 * 4. LocalDate 
		 */
		
		ChronoLocalDate currentDate = LocalDate.parse("2020-09-01");
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		Clock clk = Clock.tickMinutes(zoneId);
		Clock clk2 = Clock.systemDefaultZone();
		
		
		
		System.out.println("ChronoLocalDate:" + currentDate.toEpochDay());//1970-01-01 start of epoch date
		System.out.println("Leap year:" + " " + currentDate.isLeapYear());
		System.out.println("Clock minutes" + " " + clk.instant());
		System.out.println("Clock system"+Clock.systemDefaultZone());
		System.out.println("clk2" + clk2.instant());
		System.out.println("clk2" + clk2.getZone());
		
		System.out.println("    ");
		
		// 3. Duration 
		// equal, toHours, 
		Duration dur1 = Duration.ofDays(10);
		Duration dur2 = Duration.ofDays(12);
		Duration dur3 = Duration.ofDays(10);
		Duration dur4 = Duration.ofHours(10);
		System.out.println(dur1.equals(dur2));
		System.out.println(dur1.equals(dur3));
		System.out.println(dur1.equals(dur4)); // False cuz cant compare days with hours
		
		Duration duration = Duration.parse("P2DT3H4M"); 
		System.out.println("Duration: " + duration); 
		System.out.println(duration.toDays());
		System.out.println(duration.toHours());
		
		//Duration dur5 = Duration.between(LocalDate.of(2020, 01, 01), LocalDate.now());// Runtime Error cuz duration needs seconds
		Duration dur5 = Duration.between(LocalTime.now(zoneId) , LocalTime.NOON);
		System.out.println(dur5.toHours()); 
		
		
		// LocalDate
		// If u want to use an exsisting date use LocalDate.parse
		// dt1.getMOnth() - January,feb, march 
		LocalDate dt1 = LocalDate.now();
		LocalDate localD = LocalDate.parse("2018-12-06"); 
		ZoneId zid = ZoneId.of("UTC");
		LocalDate dt2 = LocalDate.now(zid); 
		LocalDate value = dt1.plusDays(7);
		LocalDate valueminus = dt1.minusDays(12);
		LocalDate valuemonths = dt1.plusMonths(15);
		Month differ = dt1.getMonth();
		int differ1 = dt1.getDayOfMonth();
		int differ2 = dt1.getMonthValue();
		int differ3 = dt1.lengthOfYear();
		int differ4 = dt1.lengthOfMonth();
		System.out.println(dt1);
		System.out.println(dt2);
		System.out.println(dt1.isLeapYear());
		System.out.println(value);
		System.out.println(valueminus);
		System.out.println(valuemonths);
		System.out.println(differ);
		System.out.println(differ1);
		System.out.println(differ2);
		System.out.println(differ3);
		System.out.println(differ4);
		
		
		//LocalDatetime
		// LocalDate gives only date and LocalDateTime gives time. 
		
		LocalDateTime dat1 = LocalDateTime.now();
		LocalDateTime dat2 = LocalDateTime.parse("2020-01-30T16:47:30.130");
		System.out.println(dat1);
		System.out.println(dat2);
		System.out.println(dat2.getDayOfMonth());
		System.out.println((DateTimeFormatter.BASIC_ISO_DATE).format(dat1));
		System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(dat2));
		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(dat2));
		System.out.println(dat2.getSecond());
		System.out.println(dat2.minusMonths(90));
		System.out.println(dat2.toLocalTime());
		
		
		// Similar to LocalDate and LocalDateTime there is LocalTime
	}

}
