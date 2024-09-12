package ZoneDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		Map<String, String> shortIds = ZoneId.SHORT_IDS;
		System.out.println(shortIds);
		System.out.println(ZoneId.systemDefault());
		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
		System.out.println(tokyoZone);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		System.out.println("===================");
		
		ZonedDateTime zdt = agora.atZone(tokyoZone);
		System.out.println(zdt);
		
		Instant nowInstant = Instant.now();
		System.out.println(nowInstant);
		
		ZonedDateTime zdt2 = nowInstant.atZone(tokyoZone);
		System.out.println(zdt2);
		
		System.out.println(ZoneOffset.MIN);
		System.out.println(ZoneOffset.MAX);
		
		ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
		OffsetDateTime offsdt = agora.atOffset(offsetManaus);
		System.out.println(offsdt);
		OffsetDateTime offsdt2 = OffsetDateTime.of(agora, offsetManaus);
		System.out.println(offsdt2);
		OffsetDateTime offsdt3 = nowInstant.atOffset(offsetManaus);
		System.out.println(offsdt3);
		
		JapaneseDate jd = JapaneseDate.from(LocalDate.now());
		System.out.println(jd);
		LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
		JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
		System.out.println(meijiEra);
	}
}