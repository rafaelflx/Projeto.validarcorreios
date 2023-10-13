package pages;

import elemento.Elementos;
import metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();

	public void buscarcepEndereco(String dado) {

		metodo.escrever(Elementos.buscarCepEndereco, dado);
		metodo.submit(Elementos.buscarCepEndereco);
	}

}
