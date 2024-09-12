package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) {
		String pattern = "'Brasil', dd 'de' MMMM 'de' yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		try {
			System.out.println(sdf.parse("Brasil, 23 de maio de 2024."));
		}catch(ParseException pe){
			pe.printStackTrace();
		} 
	}
}