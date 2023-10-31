package classeAbstrata;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Leao leao = new Leao("Simba","M","Leão Selvagem");
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		leao.dormir();
		System.out.println("---------------------");
		
		Lobo lobo = new Lobo("Lady","F","Lobo da neve");
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		lobo.dormir();
		System.out.println("--------------------------");
		
		Tigre tigre = new Tigre("Diego","M","Tigre-dente-de-sabre");
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		tigre.emitirSom();
		System.out.println("----------------------");
		
		Cachorro dog = new Cachorro("PomPom","F","Lulu da pomerania");
		dog.caminhar();
		dog.correr();
		dog.dormir();
		dog.emitirSom();
		System.out.println("-----------------------");
		
		Gato cat = new Gato("Tom","M","Gato cinza");
		cat.caminhar();
		cat.correr();
		cat.dormir();
		cat.emitirSom();
		
		
	}

}
