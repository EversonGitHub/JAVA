package MétodoReference.Estático;

public class Serie {
	private String titulo;
	private int episodios;
	
	public Serie(String t, int e) {
		titulo = t;
		episodios = e;
	}

	@Override
	public String toString() {
		return "Série - Titulo: " + titulo + ".\nEpisodios: " + episodios + ".";
	}

	public String getTitulo() {
		return titulo;
	}

	public int getEpisodios() {
		return episodios;
	}
}