package exercicios;

public class ExemploForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vect = new String[] {"Anderson","Luiz","Ricardo"};
		
		for(int i = 0; i <vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------");
		
		//Leitura: "para cada objeto "nome" contido em "vect" faça:"
		
		for(String nome : vect) {
			System.out.println(nome);
		}
	}

}
