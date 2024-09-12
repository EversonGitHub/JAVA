package TryWithResources;

import java.io.Closeable;
import java.io.IOException;

public class Leitor implements Closeable {
	@Override
	public void close() throws IOException{
		System.out.println("Encerrando leitor.");
	}
}