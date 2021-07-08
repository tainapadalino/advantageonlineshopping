package advantageonlineshopping.metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	static WebDriver driver;

	/**
	 * Método para abrir navegador Chrome ou Firefox, após maximizar a tela,
	 * aguardará 5 segundos para continuar
	 * 
	 * @author Tainá Padalino
	 * @param browser
	 * @param site
	 */

	public void abrirNavegador(String browser, String site) {

		try {
			if (browser == "CHROME") {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser == "FIREFOX") {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();

			} else {
				System.out.println("Digite CHROME ou FIREFOX");
			}
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("----- error ao abrir navegador " + e.getMessage());

		}
	}

}
