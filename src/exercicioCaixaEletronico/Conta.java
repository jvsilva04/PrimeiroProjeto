package exercicioCaixaEletronico;

public class Conta {
	String nome;
	tipoConta tipoDeConta;
	private double saldo = 0;
	
	Conta(String nome, tipoConta tipo, double saldo){
		this.nome = nome;
		this.tipoDeConta = tipo;
		this.saldo = saldo;
	}
	
	public boolean adicionarSaldo(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean transferirSaldo(double valor) {
		if (this.saldo >= valor || this.tipoDeConta.equals(tipoConta.CORRENTE)) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public tipoConta getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(tipoConta tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
