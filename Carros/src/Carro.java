public class Carro {
	int potencia;
	int velocidade;
	int velocidadeMaxima;
	String nome;
	
	void acelerar(){
		velocidade += potencia;
	}
	
	void frear(){
		velocidade = velocidade / 2;
	}
	
	int getVelocidade(){
		return velocidade;
	}
	
	void imprimir(){
		System.out.println("O carro " + nome + " est� a velocidade de " + getVelocidade() + " Km/h");
	}
}
