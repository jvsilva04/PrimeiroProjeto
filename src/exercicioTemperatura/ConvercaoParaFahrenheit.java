package exercicioTemperatura;

public class ConvercaoParaFahrenheit {
	public static void main(String[] args) {
		int temperaturaEmCelsius = 29;
		
		int temperaturaEmFahrenheit = (int) (temperaturaEmCelsius * 1.8) +32;
		
		System.out.println(temperaturaEmFahrenheit);
	}
}
