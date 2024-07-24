package exercicioCaixaEletronico;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int retorno = 0;
		
		try {
			System.out.println("Iniciando conta!!!");
			System.out.println("Por favor digite o seu nome completo:");
			String nome = entrada.nextLine();
			
			System.out.println("Por favor escolha qual o tipo de conta deseja:");
			System.out.println("1- Conta corrente.");
			System.out.println("2- Conta poupança.");
			int tipo = entrada.nextInt();
			tipoConta tipoDaConta;
			if (tipo == 1) {
				tipoDaConta = tipoConta.CORRENTE;
			} else {
				tipoDaConta = tipoConta.POUPANÇA;
			}
			
			System.out.println("Por favor informe o saldo que deja depositar:");
			double saldo = entrada.nextDouble();
			
			Conta conta = new Conta(nome, tipoDaConta, saldo);
			
			do {
				try {
					System.out.println("Seleciona a opção que deseja:");
					System.out.println("1- Receber.");
					System.out.println("2- Transferir.");
					System.out.println("3- Consultar saldo.");
					System.out.println("9- Sair.");
				
				
					retorno = entrada.nextInt();
					switch(retorno) {
						case 1: {
							System.out.println("Insira o valor a receber:");
							double valorRecebe = entrada.nextDouble();
							boolean transacao = conta.adicionarSaldo(valorRecebe);
							if (transacao == true) {
								System.out.println("Valor recebido com sucesso!");
							} else {
								System.out.println("Valor deve ser maior que zero!");
							}
							break;
						}
						case 2: {
							System.out.println("Insira o valor a transferir:");
							double valorTransfere = entrada.nextDouble();
							boolean transacao = conta.transferirSaldo(valorTransfere);
							if (transacao == true) {
								System.out.println("Valor transferido com sucesso!");
							} else {
								System.out.println("Saldo insulficiente para essa transação!");
							}
							break;
						}
						case 3: {
							System.out.println("Seu saldo é de:");
							System.out.println(conta.getSaldo());
							break;
						}
						case 9: {
							System.out.println("Encerrando operação!");
							break;
						}
					}
				} catch(Exception e) {
					System.out.println("Entrada invalida, tente novamente e informe apenas o que foi pedido.");
				}
				
			} while( retorno != 9);
			
		} catch(Exception e) {
			System.out.println("Entrada invalida, tente novamente e informe apenas o que foi pedido.");
		}
	}
}
