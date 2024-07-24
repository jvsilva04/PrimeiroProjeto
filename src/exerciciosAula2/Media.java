package exerciciosAula2;

public class Media {
	public static void main(String[] args) {
		String mensagem = "A media arredondada é: ";
		Notas notas = new Notas(10.0,7.5);
		char notaFormatada = 'B';
		System.out.println(mensagem + notas.calculaMedia() +" "+ notaFormatada);
	}
}
