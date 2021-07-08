package advantageonlineshopping.metodos;

import advantageonlineshopping.elementos.Elementos;

public class HomePage {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void abrirUser() {
		metodos.clicar(el.getMenuUser(), " no menu user");
	}

	public void abrirFormulario() {
		metodos.clicarPorTexto("a", "CREATE NEW ACCOUNT", " formulario para abrir conta");

	}

}
