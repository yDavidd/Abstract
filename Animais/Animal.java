package Animais;

public abstract class Animal {
	private String nome;
	private String sexo;
	private String raca;
	public Animal(String nome, String sexo, String raca) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void dormir() {
		System.out.println("Dormir");
	}
	public void caminhar() {
		System.out.println("Caminhar");
	}
	public  void correr() {
		System.out.println("Correr");
	}
	public void emitirSom() {
		System.out.println("Emitir Som");
	}
}
