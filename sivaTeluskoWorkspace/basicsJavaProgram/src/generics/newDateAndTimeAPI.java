package generics;
import java.time.*;
//It was introduced in Java version 8
//The classes present inside Java.Time package does not have constructor
//so we wont use new keyword
//It was introduced by Jorda team
public class newDateAndTimeAPI {

	public static void main(String[] args) {
LocalDate ld=LocalDate.now();
System.out.println("Date Starts");
System.out.println(ld);
int dayOfMonth=ld.getDayOfMonth();
DayOfWeek dayOfWeek=ld.getDayOfWeek();
int dayOfYear=ld.getDayOfYear();
int monthValue=ld.getMonthValue();
Month month=ld.getMonth();
int year=ld.getYear();
System.out.println("dayOfMonth : "+dayOfMonth);
System.out.println("dayOfWeek : "+dayOfWeek);
System.out.println("dayOfYear : "+dayOfYear);
System.out.println("monthValue : "+monthValue);
System.out.println("month : "+month);
System.out.println("year : "+year);
System.out.println("Date End");

System.out.println("Time Starts");
LocalTime lt=LocalTime.now();
System.out.println("Local Time : "+lt);
int hour=lt.getHour();
int minute=lt.getMinute();
int second=lt.getSecond();
int nanoSecond=lt.getNano();

System.out.println("hour : "+hour);
System.out.println("minute : "+minute);
System.out.println("second : "+second);
System.out.println("nanoSecond : "+nanoSecond);
System.out.println("Time Ends");

System.out.println("If we want both local date and time");
LocalDateTime ldt=LocalDateTime.now();
System.out.println(ldt);





	}

}
