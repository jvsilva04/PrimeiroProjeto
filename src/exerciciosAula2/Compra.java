package exerciciosAula2;

public class Compra {
	public static void main(String[] args) {
		Produto caneta = new Produto("Caneta", 1.55, 0);
		Produto caderno = new Produto("Caderno", 10.0 , 25.5);
		
		Pedido pedido1 = new Pedido(caderno, 2);
		System.out.println("Valor da compra de 2 cadernos é : "+pedido1.calculaTotalPedido());
		
		Pedido pedido2 = new Pedido(caneta, 4);
		System.out.println("Valor da compra de 4 canetas é : "+pedido2.calculaTotalPedido());
		
		double totalDaCompra = pedido1.calculaTotalPedido() + pedido2.calculaTotalPedido();
		
		System.out.println("Valor total da compra em reais é : "+totalDaCompra);
		
		double valorEmDolares = totalDaCompra / 4.94;
		
		System.out.println("Valor total da compra em dolares é : "+valorEmDolares);
	}
}
