package exercicioCalculos;

import java.util.Scanner;

public class Calculos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int retorno = 0;
		
		do {
			System.out.println("Seleciona a opção que deseja:");
			System.out.println("1- Converter numero de positivo para negativo, ou vice e versa.");
			System.out.println("2- Comparar dois numeros.");
			System.out.println("3- Calcular area.");
			System.out.println("4- Exibir a tabuada de um numero.");
			System.out.println("5- Verificar se o numero é par ou ímpar.");
			System.out.println("6- Calcular o fatorial.");
			System.out.println("0- Sair.");
			
			try {
				retorno = entrada.nextInt();
				
				switch (retorno) {
					case 1: {
						
						System.out.println("Informe um numero positivo ou negativo para que possa ser convertido:");
						int numeroConvert = entrada.nextInt();
						
						numeroConvert = numeroConvert * -1;
						
						System.out.println("Seu numero convertido é: " + numeroConvert);
						break;
					}
					case 2: {
						
						System.out.println("Informe dois numeros para comparação:");
						int numeroComparacao1 = entrada.nextInt();
						int numeroComparacao2 = entrada.nextInt();
						
						if (numeroComparacao1 == numeroComparacao2) {
							System.out.println("Os numeros são iguais!");
						} else if (numeroComparacao1 > numeroComparacao2) {
							System.out.println("Os numeros são diferentes e o numero " + numeroComparacao1 + " é maior que o numero " + numeroComparacao2);
						} else {
							System.out.println("Os numeros são diferentes e o numero " + numeroComparacao2 + " é maior que o numero " + numeroComparacao1);
						}
						
						break;
					}
					case 3: {
						
						System.out.println("Informe qual das duas opções você deseja calcular:");
						System.out.println("1- Area de um quadrado.");
						System.out.println("2- Area de um circulo.");
						int opcao = entrada.nextInt();
						
						if (opcao == 1) {
							System.out.println("Informe o comprimento de um lado do quadrado:");
							int comprimento = entrada.nextInt();
							
							double areaQuadrado = Math.pow(comprimento, 2);
							System.out.println("A area do quadrado é " + areaQuadrado);
						} else if (opcao == 2) {
							System.out.println("Informe o raio do circulo:");
							double pi = 3.14;
							int raio = entrada.nextInt();
							
							double areaCirculo = pi * (Math.pow(raio, 2));
							System.out.println("A area do circulo é " + areaCirculo);
						}
						
						break;
					}
					case 4: {
						System.out.println("Informe um numero que você queira saber a tabuada:");
						int numero = entrada.nextInt();
						
						for (int i = 1; i <= 10; i++) {
							System.out.println(numero + "X" + i + " = " + numero*i);
						}
						
						break;
					}
					case 5: {
						System.out.println("Informe um numero que você queira saber se é par ou ímpar:");
						int num = entrada.nextInt();
						
						int restoDaDivisao = num % 2;
						
						if (restoDaDivisao == 1) {
							System.out.println("O numero é Impar.");
						} else {
							System.out.println("O numero é Par.");
						}
						break;
					}
					case 6: {
						System.out.println("Informe um numero que você queira saber o valor fatorial:");
						int fatorial = entrada.nextInt();
						int resultado = 1;
						if (fatorial != 0) {
							for (var i = 1; i <= fatorial; i++ ) {
								resultado = resultado * i;
							}
						}
						System.out.println("O fatorial de " + fatorial + " é " + resultado);
						break;
					}
					case 0: {
						System.out.println("Programa finalizado!");
						break;
					}
					default:
						retorno = 0;
						System.out.println("Entrada invalida, reinicie o programa e informe apenas um numero que esteja dentro das opções acima.");
						break;
				}
			}catch(Exception e) {
				retorno = 0;
				System.out.println("Entrada invalida, reinicie o programa e informe apenas um numero que esteja dentro das opções acima.");
			}
			
		} while (retorno != 0);
		
	}
}
