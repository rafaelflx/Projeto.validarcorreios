package pages;

import elemento.Elementos;
import metodos.Metodos;

public class ResultadoPage {

	Metodos metodo = new Metodos();

	public void validarDadosRetornados(String logradouro, String bairro, String localidade, String cep) throws InterruptedException {
		metodo.mudarAba();
		metodo.validarTexto(Elementos.logradouro_Nome, logradouro);
		metodo.validarTexto(Elementos.bairro_Distrito, bairro);
		metodo.validarTexto(Elementos.localidade_UF, localidade);
		metodo.validarTexto(Elementos.cep, cep);
	}
	
	public void validarMsg(String msgInval) {
		metodo.mudarAba();
		metodo.validarMsg(Elementos.msgInvalida, msgInval);
		
	}

}
