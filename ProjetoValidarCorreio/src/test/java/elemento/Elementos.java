package elemento;

import org.openqa.selenium.By;

public class Elementos {
	
	public static By buscarCepEndereco = By.id("relaxation");
	public static By logradouro_Nome = By.xpath("//td[@data-th='Logradouro/Nome']");
	public static By bairro_Distrito = By.xpath("//td[@data-th='Bairro/Distrito']");
	public static By localidade_UF = By.xpath("//td[@data-th='Localidade/UF']");
	public static By cep = By.xpath("//td[@data-th='CEP']");
	public static By msgInvalida = By.xpath("//*[@id='mensagem-resultado-alerta']/h6");
	public static By msgCaracter = By.xpath("//*[@id='alerta']/div[1]");
	public static By novaBusca = By.xpath("//*[@id='endereco']");
	public static By btnBusca = By.xpath("//*[@id='btn_pesquisar']");
	
}
