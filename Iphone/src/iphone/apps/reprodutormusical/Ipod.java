package iphone.apps.reprodutormusical;

public class Ipod implements ReprodutordeMusica{

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Reproduzindo musica");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando musica");		
	}

}
