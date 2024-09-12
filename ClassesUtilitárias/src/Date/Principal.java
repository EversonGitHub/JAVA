package Date;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Date date = new Date(15544512131L);
		
		date.setTime(date.getTime() + 31246544);
		System.out.println(date);
	}
}