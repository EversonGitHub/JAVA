package TemporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class Principal {

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		agora = agora.with(ChronoField.DAY_OF_MONTH, 23);
		System.out.println(agora);
		System.out.println(agora.getDayOfWeek());
		
		agora = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(agora);
		System.out.println(agora.getDayOfWeek());
		
		agora = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(agora);
		System.out.println(agora.getDayOfWeek());
		
		agora = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(agora);
		System.out.println(agora.getDayOfWeek());
	}
}