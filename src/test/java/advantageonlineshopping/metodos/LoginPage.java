package advantageonlineshopping.metodos;

import org.openqa.selenium.By;

public class LoginPage {

	Metodos metodos = new Metodos();

	By username = By.name("username");
	By password = By.name("password");
	By signin = By.id("sign_in_btnundefined");

	public void fazerLogin(String nome, String senha) throws InterruptedException {
		metodos.escrever(username, nome, " preencher o campo username.");
		metodos.escrever(password, senha, " preencher o campo password.");
		Thread.sleep(3000);
		metodos.clicar(signin, " clicar sign in");

	}
}