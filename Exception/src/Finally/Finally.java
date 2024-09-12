package Finally;

public class Finally {

	public static void main(String[] args) {
		abrirConexao();
	}
	
	private static String abrirConexao(){
		try {
			System.out.println("Abrindo arquivo.");
			System.out.println("Escrevendo dados no arquivo.");
			return "Conexão estabelecida com sucesso.";
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("Fechando recursos liberados pelo SO");
		}
		return null;
	}
}