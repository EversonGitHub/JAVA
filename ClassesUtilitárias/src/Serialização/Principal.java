package Serialização;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(10L, "Alfredo.", "2456562656");
		serializar(aluno);
		deserializar();
	}
	
	private static void serializar(Aluno aluno) {
		Path path = Paths.get("Aluno.serializado");
		try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
			oos.writeObject(aluno);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private static void deserializar() {
		Path path = Paths.get("Aluno.serializado");
		try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
			Aluno aluno = (Aluno) ois.readObject();
		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}