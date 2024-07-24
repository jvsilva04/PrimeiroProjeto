package primeiroProjeto;

public class Main {
	public static void main(String[] args) {
		System.out.println("Esse é o Screen Match");
		System.out.println("Filme: Top Gun: Maverick");
		
		int anoDeLancamento = 2022;
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		
		//Comentado
		/*boolean incluidoNoPlano = true;
		double notaDoFilme = 9.5;*/
		
		double media = (9.5 + 6.3 + 8.8) / 3;
		System.out.println(media);
		String sinopse = """
					Filme de aventura com aviões de caça.
					Classificação: 16 anos.
					Nota media: %f
					""".formatted(media);
				
		
		
		System.out.println(sinopse);
		
		int classificacao = (int) media / 2;
		
		System.out.println(classificacao);
	}
}
