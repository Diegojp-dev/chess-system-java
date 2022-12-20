package aplicacao;

import xadrez.JogoDeXadrez;

public class Program {

	public static void main(String[] args) {
		
		JogoDeXadrez jogoDeXadrez = new JogoDeXadrez();
		UI.placaDeImpressao(jogoDeXadrez.pegarPecas());
	}

}
