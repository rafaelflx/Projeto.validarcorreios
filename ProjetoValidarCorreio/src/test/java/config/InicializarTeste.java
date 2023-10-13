package config;

import org.openqa.selenium.chrome.ChromeDriver;
import driversConexao.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InicializarTeste extends Drivers{
	
	static String ambiente = "https://www.correios.com.br";
	
	public static void configurarAmbiente() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();
	}
	
	public static void encerrarTeste() {
		
		driver.quit();
	}
		
	

}
