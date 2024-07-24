package exercicioDeAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
	public static void main(String[] args) {
		int numeroAleatorio = new Random().nextInt(10);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Adivinhe qual o numero aleatorio gerado entre 0 e 100 em apenas 5 tentativas!!!");
		for (int i = 0; i < 5; i++) {
			System.out.println("Tentativa "+ (i+1));
			int tentativa = entrada.nextInt();
			
			if (tentativa == numeroAleatorio) {
				System.out.println("Você acertou!!!");
				break;
			} else if (tentativa > numeroAleatorio){
				System.out.println("Esse numero é maior que o gerado!");
			} else {
				System.out.println("Esse numero é menor que o gerado!");
			}
		}
		
		entrada.close();
	}
}
