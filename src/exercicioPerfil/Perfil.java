package exercicioPerfil;

public class Perfil {
	public static void main(String[] args) {
		System.out.println("Olá, João!");
		System.out.println("Tudo Bem?");
		
		Estudos estudo1 = new Estudos("Aula 1 de Java");
		
		System.out.println(estudo1.getAnotacao());
		
		Calculo somaNotas = new Calculo(10, 5.5);
		System.out.println("A soma das duas notas é: "+ somaNotas.soma());
		System.out.println("A subtração das duas notas é: "+ somaNotas.subtracao());
	}
}
