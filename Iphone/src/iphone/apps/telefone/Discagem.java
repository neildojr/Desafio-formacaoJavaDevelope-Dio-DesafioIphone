package iphone.apps.telefone;

public class Discagem implements Telefone {

	@Override
	public void ligar() {
		System.out.println("Digitando...");
		System.out.println("+55 21 4002-8922");
		System.out.println("ligando");
	}
	@Override
	public void receberLigação() {
		System.out.println("Recebendo Ligação...");
		atender();
	}

	@Override
	public void atender() {
		System.out.println("atendendo");		
	}
	@Override
	public void correioDeVoz() {
		System.out.println("Reproduzindo mensagem de Voz");			
	}

}
