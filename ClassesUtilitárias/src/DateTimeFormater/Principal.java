package DateTimeFormater;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		String s = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		LocalDate parse = LocalDate.parse("20240227", DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate parse2 = LocalDate.parse("2024-02-27+05:00", DateTimeFormatter.ISO_DATE);
		LocalDate parse3 = LocalDate.parse("2024-02-27", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(parse);
		System.out.println(parse2);
		System.out.println(parse3);
		
		LocalDateTime agora = LocalDateTime.now();
		String s4 = agora.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(s4);
		
		DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatoBR = LocalDate.now().format(formatterBR);
		System.out.println(formatoBR);
		LocalDate parseBR = LocalDate.parse("27/02/2024", formatterBR);
		System.out.println(parseBR);
		
	}
}