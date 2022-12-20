package xadrez;



import JogoDeTabuleiro.Posicao;
import JogoDeTabuleiro.Tabuleiro;
import pecasDeXadrez.Rei;
import pecasDeXadrez.Torre;

public class JogoDeXadrez {

	private Tabuleiro tabuleiro;
	
	public JogoDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configuracaoInicial();
	}
	
	public PecaDeXadrez[][] pegarPecas(){
		PecaDeXadrez[][] partida = new PecaDeXadrez[tabuleiro.pegarLinhas()][tabuleiro.pegarColunas()];
		for(int i = 0; i < tabuleiro.pegarLinhas(); i++) {
			for(int j = 0 ; j < tabuleiro.pegarColunas() ; j++ ) {
				partida[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		return partida;
	}
	
	private void configuracaoInicial() {
		tabuleiro.lugarDaPeca(new Torre(tabuleiro,Cor.BRANCO), new Posicao(2,1));
		tabuleiro.lugarDaPeca(new Rei(tabuleiro,Cor.PRETO), new Posicao(0,4));
		tabuleiro.lugarDaPeca(new Rei(tabuleiro,Cor.BRANCO), new Posicao(7,4));
	}
	
}
