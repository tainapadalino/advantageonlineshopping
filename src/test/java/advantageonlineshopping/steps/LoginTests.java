package advantageonlineshopping.steps;

import advantageonlineshopping.elementos.Elementos;
import advantageonlineshopping.metodos.Browsers;
import advantageonlineshopping.metodos.HomePage;
import advantageonlineshopping.metodos.LoginPage;
import advantageonlineshopping.metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTests {

	Browsers browser = new Browsers();
	Metodos metodos = new Metodos();
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();
	Elementos elementos = new Elementos();

	@Given("acesso o login")
	public void acesso_o_login() {
		home.abrirUser();
	}

	@When("preencho os dados validos")
	public void preencho_os_dados_validos() throws InterruptedException {
		login.fazerLogin("Keeggo", "Teste1234");
		metodos.validarTexto(elementos.getMenuUserLink(), "Keeggo", " validando o nome apos cadastro");
		metodos.screenShot("validacaologin", " validando o login.");
		metodos.fecharNavegador();

	}

	@When("preencho os dados invalidos")
	public void preencho_os_dados_invalidos() throws InterruptedException {
		login.fazerLogin("Teste", "Senhaincorreta1");
		metodos.screenShot("validacaologininvalido", " validando o login invalido.");

	}

	@Then("usuario ou senha invalidos")
	public void usuario_ou_senha_invalidos() {
		metodos.fecharNavegador();

	}

}
