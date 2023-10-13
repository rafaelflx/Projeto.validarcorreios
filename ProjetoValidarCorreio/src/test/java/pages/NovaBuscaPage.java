package pages;

import elemento.Elementos;
import metodos.Metodos;

public class NovaBuscaPage {
	
	Metodos metodo = new Metodos();
	
	public void novaBusca(String dado) {
		metodo.mudarAba();
		metodo.escrever(Elementos.novaBusca, dado);
		metodo.clicar(Elementos.btnBusca);
	}
	
	public void validarMsgCaracter(String msgCarac) {
		metodo.mudarAba();
		metodo.validarMsg(Elementos.msgCaracter, msgCarac);
		
	}

}
