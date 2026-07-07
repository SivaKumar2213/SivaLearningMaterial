package generics;
//two Date Class are there
//1)Java.util.date-->It has no argument constructor
//2)Java.sql.date-->It has only parameterized constructor(If we pass time in milliseconds of Long then will return the date)

import java.util.Date;

public class dateAndTime {

	public static void main(String[] args) {
Date date=new Date();
System.out.println("Java Util Date :"+date);
long time =date.getTime();
System.out.println("Time In Milliseconds :"+time);
java.sql.Date sqlDate=new java.sql.Date(time);
System.out.println("Java sql Date :"+sqlDate);
	}

}
