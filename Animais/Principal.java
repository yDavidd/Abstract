package Animais;

public class Principal {
	public static void main(String[] args) { 
	
	Lobo lobo = new Lobo("Lobo", "Fêmea", "Alguma raça");
	Leao leao = new Leao("Leão", "Macho", "Alguma raça");
	Gato gato = new Gato("Gato", "Fêmea", "Alguma raça");
	Cachorro cachorro = new Cachorro("Cachorro", "Macho", "Alguma raça");
	Tigre tigre = new Tigre("Tigre", "Macho", "Alguma raça");
	
	System.out.println(lobo.getNome());
	System.out.println(lobo.getSexo());
	System.out.println(lobo.getRaca());
	lobo.emitirSom();
	
	System.out.println("----------------");
	
	System.out.println(leao.getNome());
	System.out.println(leao.getSexo());
	System.out.println(leao.getRaca());
	leao.emitirSom();
	
	System.out.println("----------------");
	
	System.out.println(gato.getNome());
	System.out.println(gato.getSexo());
	System.out.println(gato.getRaca());
	gato.emitirSom();
	
	System.out.println("----------------");
	
	System.out.println(cachorro.getNome());
	System.out.println(cachorro.getSexo());
	System.out.println(cachorro.getRaca());
	cachorro.emitirSom();
	
	System.out.println("-----------------");
	
	System.out.println(tigre.getNome());
	System.out.println(tigre.getSexo());
	System.out.println(tigre.getRaca());
	tigre.emitirSom();
	
	
	
	
	
	
	
	}
}
