package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.openqa.selenium.By;
import driversConexao.Drivers;

public class Metodos extends Drivers {

	public void escrever(By locator, String texto) {
		driver.findElement(locator).sendKeys(texto);

	}

	public void clicar(By locator) {
		driver.findElement(locator).click();

	}

	public void submit(By locator) {

		driver.findElement(locator).submit();

	}

	public void validarTexto(By locator, String textoEsperado) {

		String textoCapturado = driver.findElement(locator).getText();
		assertEquals(textoEsperado, textoCapturado);

	}

	public void validarMsg(By locator, String textoEsperado) {

		String textoCapturado = driver.findElement(locator).getText();
		assertEquals(textoEsperado, textoCapturado);

	}

	public void mudarAba() {

		String janelaPrincipal = driver.getWindowHandle();
		Set<String> todasJanelas = driver.getWindowHandles();
		for (String janela : todasJanelas) {
			if (!janela.equals(janelaPrincipal)) {
				driver.switchTo().window(janela);
			}
		}

	}
	
	public void validarTextoAlert(String textoEsperado) {
		
		String msgAlert = driver.switchTo().alert().getText();
		assertTrue(msgAlert.contains(textoEsperado));

	}

}
