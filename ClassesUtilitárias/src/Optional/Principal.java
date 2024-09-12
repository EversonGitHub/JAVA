package Optional;

import java.util.List;
import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		Optional<String> o = Optional.of("Teste optional.");
		Optional<String> o2 = Optional.ofNullable(null);
		Optional<String> o3 = Optional.empty();
		
		System.out.println(o);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println("--------------------");
		
		Optional<String> nameOptional = Optional.ofNullable(("Marcelo"));
		String empty = nameOptional.orElse("VAZIO");
		System.out.println(empty);
		nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
	}
	
	private static Optional<String> findName(String name) {
		List<String> lista = List.of("Marcelo", "Rodrigo");
		int i = lista.indexOf(name);
		if(i != 1) {
			return Optional.of(lista.get(i));
		}
		return Optional.empty();
	}
}