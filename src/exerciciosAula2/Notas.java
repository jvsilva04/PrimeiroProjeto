package exerciciosAula2;

public class Notas {
	double nota1;
	double nota2;
	
	Notas(double nota1, double nota2){
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public int calculaMedia() {
		int resultado = (int) (nota1 + nota2) / 2;
		return resultado;
	}
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

}
