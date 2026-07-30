package DateAndTime;
import java.text.DateFormat;
import java.util.Date;
public class Formats {
public static void main(String[] args) {
  Date d=new Date();
  System.out.println("FULL   : " + DateFormat.getDateInstance(DateFormat.FULL).format(d));
  System.out.println("LONG   : " + DateFormat.getDateInstance(DateFormat.LONG).format(d));
  System.out.println("MEDIUM : " + DateFormat.getDateInstance(DateFormat.MEDIUM).format(d));
  System.out.println("SHORT  : " + DateFormat.getDateInstance(DateFormat.SHORT).format(d));
}
}
