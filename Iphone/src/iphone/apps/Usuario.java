package iphone.apps;

import iphone.apps.sistemaIphone.Iphone;

public class Usuario extends Iphone {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();

		System.out.println("Ligando Iphone...");
		System.out.println("Iphone ligado");
		System.out.println("                            ");


		iphone.ligar();
		iphone.receberLigação();
		System.out.println("                                                               ");
		System.out.println("Recebendo chamada...");
		System.out.println("                                                               ");
		iphone.correioDeVoz();
		System.out.println("                                                               ");
		System.out.println("                                                               ");
		System.out.println("Abrindo Ipod");
		iphone.selecionarMusica();
		System.out.println("Reproduzindo...");
		System.out.println("Mc Poze do Rodo - To Voando Alto");
		iphone.pausarMusica();
		System.out.println("                                                               ");
		System.out.println("Abrindo Safari");
		iphone.adicionarNovaAba();
		iphone.exibirPagina();
		iphone.atualizarPagina();
	}
}
