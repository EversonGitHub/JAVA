package Coleções.Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Peçoa", "Pessoa");
		map.put("Teklado", "Teclado");
		map.put("Mouze", "Mouse");
		System.out.println(map);
		
		for(String key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println("--------------------");
		
		for(String value: map.values()) {
			System.out.println(value);
		}
	}
}