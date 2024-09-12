package TemporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Exercício {

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		System.out.println(agora.getDayOfWeek());
		
		agora = LocalDate.now().with(new ObterProximoDiaUtil());
		System.out.println(agora);
		System.out.println(agora.getDayOfWeek());
		
		agora = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());
		System.out.println(agora);
		System.out.println(agora.getDayOfWeek());
	}
	
	static class ObterProximoDiaUtil implements TemporalAdjuster{
		@Override
		public Temporal adjustInto(Temporal temporal){
			DayOfWeek diaDaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
			int addDias = 0;
			switch(diaDaSemana) {
				case THURSDAY: addDias = 4;
				break;
			 	case FRIDAY: addDias = 3;
			 	break;
			 	case SATURDAY: addDias = 2;
			 	break;
			 	default: addDias = 1;
			}
			return temporal.plus(addDias, ChronoUnit.DAYS);
		}
	}
}