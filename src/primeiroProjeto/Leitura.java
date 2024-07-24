package primeiroProjeto;

import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o ultimo filme que você viu");
		String filme = leitura.nextLine();
		System.out.println(filme);
		
		System.out.println("Qual o ano de lançamento do filme?");
		int ano = leitura.nextInt();
		System.out.println(ano);
		
		System.out.println("Qual a nota do filme?");
		double nota = leitura.nextDouble();
		System.out.println(nota);
		
		leitura.close();
	}
}
