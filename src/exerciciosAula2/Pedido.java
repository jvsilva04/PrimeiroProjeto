package exerciciosAula2;

public class Pedido {
	double valorTotal;
	int quantidade;
	Produto produto;
	
	Pedido(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public double calculaTotalPedido() {
		double desconto = this.produto.getValor() * (this.produto.getDesconto() / 100);
		this.valorTotal = (this.produto.getValor() - desconto) *  this.quantidade;
		return this.valorTotal;
	}
}
