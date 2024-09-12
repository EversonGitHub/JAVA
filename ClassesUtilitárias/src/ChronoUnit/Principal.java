package ChronoUnit;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Principal {

	public static void main(String[] args) {
		LocalDateTime aniversario = LocalDateTime.of(2024, Month.MAY, 6, 5, 3, 0);
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(ChronoUnit.DAYS.between(aniversario, agora));
		System.out.println(ChronoUnit.WEEKS.between(aniversario, agora));
		System.out.println(ChronoUnit.MONTHS.between(aniversario, agora));
		System.out.println(ChronoUnit.YEARS.between(aniversario, agora));
	}
}