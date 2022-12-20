package xadrez;

import JogoDeTabuleiro.Posicao;

public class PosicaoDeXadrez {

	private char coluna;
	private int linha;
	
	
	public PosicaoDeXadrez(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8 ) {
			throw new ExecessaoDeXadrez("os valores válidos da posição de xadrez de instanciação de erro são de a1 a h8;");
		}
		this.coluna = coluna;
		this.linha = linha;
	}


	public char pegarColuna() {
		return coluna;
	}


	public int paegarLinha() {
		return linha;
	}

	protected Posicao posicionar() {
		return new Posicao(8- linha, coluna - 'a' );
	}
	
	protected static PosicaoDeXadrez partirDaPosicao(Posicao posicao) {
		return new PosicaoDeXadrez( (char) ('a' - posicao.pegarColuna()),8 - posicao.pegarLinha() );
	}
	
	@Override
	public String toString() {
		return ""+ coluna + linha;
	}
}
