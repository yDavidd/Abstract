package Calculadora;

public class Principal {

	public static void main(String[] args) {
		
		Calculando calculando = new Calculando();
		
		System.out.println("Valor A: "+22 +"\nValor B: "+11+"\n");
		System.out.println(calculando.somar(22, 11));
		System.out.println(calculando.sub(22, 11));
		System.out.println(calculando.mult(22, 11));
		System.out.println(calculando.div(22,11));
		System.out.println(calculando.exp(22, 11));
		
		

	}

}
