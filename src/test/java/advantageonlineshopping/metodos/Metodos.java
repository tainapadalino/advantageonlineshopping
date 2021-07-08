package advantageonlineshopping.metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Metodos extends Browsers {

	/**
	 * Metodo para clicar em um elemento
	 * 
	 * @author Tainá Padalino
	 * @param elemento
	 * @param passo
	 */
	public void clicar(By elemento, String passo) {
		try {
			Thread.sleep(1000);
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("****** error ao clicar no elemento " + passo + " ****** " + e.getMessage());
		}
		System.out.println("------- INICIANDO O TESTE -------");
	}

	/**
	 * Método para clicar informando um texto especifico e uma tag
	 * 
	 * @author Tainá Padalino
	 * @param texto
	 * @param tag
	 * @param passo
	 */
	public void clicarPorTexto(String tag, String texto, String passo) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//" + tag + "[text()=\"" + texto + "\"]")).click();
		} catch (Exception e) {
			System.err.println("****** error ao clicar por texto " + passo + " ****** " + e.getMessage());
		}
	}

	/**
	 * Método para gerar nome com String + 4 letras aleatórias
	 * 
	 * @author Tainá Padalino
	 * @return
	 */
	public String getNome(String nome) {
		String geradorDeNome = RandomStringUtils.randomAlphabetic(4);
		return nome + geradorDeNome;
	}

	/**
	 * Método para gerar e-mail com @keeggo.com e + 4 letras aleatórias
	 * 
	 * @author Tainá Padalino
	 * @return
	 */
	public String getEmail() {
		String geradorDeEmail = RandomStringUtils.randomAlphabetic(4);
		return geradorDeEmail + "@keeggo.com";

	}

	/**
	 * Método para escrever um texto
	 * 
	 * @author Tainá Padalino
	 * @param elemento
	 * @param texto
	 * @param passo
	 */
	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("****** error ao escrever " + passo + " ****** " + e.getMessage());
		}

	}

	/**
	 * Método para validar se dois textos são iguais
	 * 
	 * @author Tainá Padalino
	 * @param elemento
	 * @param textoEsperado
	 * @param passo
	 */
	public void validarTexto(By elemento, String textoEsperado, String passo) {
		try {
			Thread.sleep(3000);
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.err.println("****** error ao validar texto " + passo + " ****** " + e.getMessage());
		}

	}

	/**
	 * Método para tirar screenshot da tela
	 * 
	 * @author Tainá Padalino
	 * @param nome
	 * @param passo
	 */
	public void screenShot(String nome, String passo) {
		try {
			Thread.sleep(3000);
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nome + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.out.println("****** error no screenShot " + passo + " ****** " + e.getMessage());
		}

	}
	
	/**
	 * Método para fechar todas as janelas
	 * 
	 * @author Tainá Padalino
	 * @param elemento
	 */

	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("****** error ao fechar ******  " + e.getStackTrace());

		}

	}
}
