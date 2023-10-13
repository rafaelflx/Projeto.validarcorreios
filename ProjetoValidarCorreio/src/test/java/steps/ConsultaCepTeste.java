package steps;

import config.InicializarTeste;
import elemento.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.HomePage;
import pages.NovaBuscaPage;
import pages.ResultadoPage;

public class ConsultaCepTeste {

	HomePage home = new HomePage();
	ResultadoPage resultado = new ResultadoPage();
	NovaBuscaPage busca = new NovaBuscaPage();
	Metodos metodo = new Metodos();

	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbiente();
	}

	@After
	public void finalizarTeste() {
		InicializarTeste.encerrarTeste();

	}

	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
		home.buscarcepEndereco("06463-200");

	}

	@Then("validar os dados retornado")
	public void validarOsDadosRetornado() throws InterruptedException {
		resultado.validarDadosRetornados("Rua Petrolina", "Jardim Mutinga", "Barueri/SP", "06463-200");

	}

	@Given("enviar os dados usando caracteres especiais")
	public void enviarOsDadosUsandoCaracteresEspeciais() {
		home.buscarcepEndereco("@");

	}

	@Then("valido mensagem de dados invalidos")
	public void validoMensagemDeDadosInvalidos() {
		resultado.validarMsg("DADOS INVALIDOS/NAO INFORMADO");

	}

	@When("envio o campo sem preencher")
	public void envioOCampoSemPreencher() {
		home.buscarcepEndereco("");

	}

	@Then("valido mensagem com a quantidade de caracteres minimos")
	public void validoMensagemComAQuantidadeDeCaracteresMinimos() {
		metodo.validarTexto(Elementos.msgCaracter, "Informe o Endereço com no mínimo 2(dois) caracteres!");

	}

	@When("envio novamente sem prencher no campo que fui direcionado")
	public void envioNovamenteSemPrencherNoCampoQueFuiDirecionado() {
		busca.novaBusca("");

	}

}
