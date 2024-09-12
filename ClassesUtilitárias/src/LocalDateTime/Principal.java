package LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate date = LocalDate.parse("2024-05-23");
		LocalDate time = LocalDate.parse("04:26");
		System.out.println(localDateTime);
		System.out.println(date);
		System.out.println(time);
	}
}