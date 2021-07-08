package advantageonlineshopping.steps;

import advantageonlineshopping.elementos.Elementos;
import advantageonlineshopping.metodos.Browsers;
import advantageonlineshopping.metodos.CadastroPage;
import advantageonlineshopping.metodos.HomePage;
import advantageonlineshopping.metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroTests {

	Browsers browser = new Browsers();
	Metodos metodos = new Metodos();
	HomePage home = new HomePage();
	CadastroPage cadastrar = new CadastroPage();
	Elementos elementos = new Elementos();

	String nome;

	@Given("que entre no site {string}")
	public void que_entre_no_site(String url) {
		browser.abrirNavegador("CHROME", url);
	}

	@Given("acesso o formulario de abertura de conta")
	public void acesso_o_formulario_de_abertura_de_conta() {
		home.abrirUser();
		home.abrirFormulario();
	}

	@When("preencho dados validos de cadastro")
	public void preencho_dados_validos_de_cadastro() throws InterruptedException {
		this.nome = metodos.getNome("Keeggo");
		cadastrar.registrarNovoCliente(this.nome, metodos.getEmail(), "Keeggo123", "Keeggo123");
	}

	@Then("cadastro realizado")
	public void cadastro_realizado() {
		metodos.validarTexto(elementos.getMenuUserLink(), this.nome, " validando o nome apos cadastro");
		metodos.screenShot("validacaoCadastro", " validando o novo cliente");
		metodos.fecharNavegador();
	}

	@When("preencho dados invalidos")
	public void preencho_dados_invalidos() throws InterruptedException {
		cadastrar.registrarNovoCliente("", "Teste1234@.com", "Teste1234", "Teste1234");

	}

	@Then("nao realiza cadastro")
	public void nao_realiza_cadastro() {
		metodos.screenShot("validacaoCadastroInvalido", " validando cadastro invalido");
		metodos.fecharNavegador();
		

	}

}
