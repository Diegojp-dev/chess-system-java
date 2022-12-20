package xadrez;

import JogoDeTabuleiro.Peca;
import JogoDeTabuleiro.Tabuleiro;

	public class PecaDeXadrez extends Peca {
	
	private Cor cor;

	public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor pegarCor() {
		return cor;
	}
		
	
}
