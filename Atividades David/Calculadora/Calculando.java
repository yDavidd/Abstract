package Calculadora;

public class Calculando implements Calculos {
	
	@Override 
	public double sub(double n1, double n2) {
		return n1 - n2;
	}
	@Override 
	public double somar(double n1, double n2) {
		return n1 + n2;
	}
	@Override 
	public double mult(double n1, double n2) {
		return n1 * n2;
	}
	@Override 
	public int div(int n1, int n2) {
		return n1 / n2;
	}
	
	@Override 
	public int exp(int n1, int n2) {
		return n1 - n2;
	
}}

