package advantageonlineshopping.metodos;

import org.openqa.selenium.By;

public class CadastroPage {

	Metodos metodos = new Metodos();

	By usernameRegisterPage = By.name("usernameRegisterPage");
	By emailRegisterPage = By.name("emailRegisterPage");
	By passwordRegisterPage = By.name("passwordRegisterPage");
	By confirmPasswordRegisterPage = By.name("confirm_passwordRegisterPage");
	By i_agree = By.name("i_agree");
	By register_btnundefined = By.id("register_btnundefined");

	public void registrarNovoCliente(String nome, String email, String senha, String confirmaSenha)
			throws InterruptedException {
		metodos.escrever(usernameRegisterPage, nome, " preencher campo nome.");
		metodos.escrever(emailRegisterPage, email, " preencher campo e-mail.");
		metodos.escrever(passwordRegisterPage, senha, " preencher o campo senha.");
		metodos.escrever(confirmPasswordRegisterPage, confirmaSenha, " preencher o campo confirma senha.");
		Thread.sleep(3000);
		metodos.clicar(i_agree, " clicar agree.");
		metodos.clicar(register_btnundefined, " clicar register.");

	}

}
