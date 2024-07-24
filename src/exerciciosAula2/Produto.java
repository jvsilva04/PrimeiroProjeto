package exerciciosAula2;

public class Produto {
	String nome;
	double valor;
	double desconto;
	
	Produto(String nome, double valor, double desconto){
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
