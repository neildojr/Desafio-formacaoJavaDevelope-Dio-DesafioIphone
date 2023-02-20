package iphone.apps.navegador;

public class Safari implements Navegador {

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Aba");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Aba");
	}
	@Override
	public void atualizarPagina() {
		System.out.println("atualizando Pagina");		
	}
}
