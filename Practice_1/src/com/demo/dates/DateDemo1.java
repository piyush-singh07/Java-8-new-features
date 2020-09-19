package com.demo.dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateDemo1 {

	public static void main(String[] args) {

		LocalDate today= LocalDate.now();
		LocalDate bday = LocalDate.of(1992,9,7);
		Period p = Period.between(bday, today);
		System.out.printf("%d - %d - %d",p.getYears(),p.getMonths(),p.getDays());
		
		Year y = Year.now();
		System.out.println("\n"+y.isLeap());
		
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId zonela= ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt1= ZonedDateTime.now(zonela);
		System.out.println(dt1);
		
		
		
	}

}
