package primeiroProjeto;

public class Condicional {
	public static void main(String[] args) {
		int anoDeLancamento = 2022;
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;
		String plano = "Plus";
		
		if (anoDeLancamento >= 2022) {
			System.out.println("Lançamento novo!");
		} else {
			System.out.println("Filme retrô!");
		}
		
		if (incluidoNoPlano == true || plano.equalsIgnoreCase("plus")) {
			System.out.println("Filme liberado!");
		} else {
			System.out.println("Filme não está no plano!");
		}
	}
}
