package ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Principal {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("RBmensagens", new Locale("pt", "BR"));
		System.out.println(bundle.getString("ola"));
		System.out.println(bundle.getString("bom.dia"));
		
		System.out.println("--------------");
		
		ResourceBundle bundle2 = ResourceBundle.getBundle("RBmessages", new Locale("en", "US"));
		System.out.println(bundle2.getString("hello"));
		System.out.println(bundle2.getString("good.morning"));
		
	}
}