package primeiroProjeto;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double mediaAvaliacao = 0;
		double nota = 0;
		int contadorDeNotas = 0;
		
		while (nota != -1) {
			System.out.println("Digite a nota do filme ou -1 para sair!");
			nota = leitura.nextDouble();
			if(nota != -1) {
				mediaAvaliacao += nota;
				contadorDeNotas++;
			}
		}
		
		System.out.println("Media é " + mediaAvaliacao / contadorDeNotas);
		leitura.close();
	}
}
