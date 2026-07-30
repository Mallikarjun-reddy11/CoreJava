package DateAndTime;


	import java.time.LocalDate;
	import java.time.LocalTime;
	import java.time.format.DateTimeFormatter;

	public class DigitalClock {
	    public static void main(String[] args) {
	        LocalDate date = LocalDate.now();
	        LocalTime time = LocalTime.now();

	        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
	        System.out.println("Current Date : " + date.format(dateFormat));
	        System.out.println("Current Time : " + time.format(timeFormat));
	        System.out.println("Current Day  : " + date.getDayOfWeek());
	        System.out.println("Current Month: " + date.getMonth());
	        System.out.println("Current Year : " + date.getYear());
	    }
	}

