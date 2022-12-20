package xadrez;



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
	
	private void colocarNovaPeca(char coluna , int linha , PecaDeXadrez peca) {
		tabuleiro.lugarDaPeca(peca, new PosicaoDeXadrez(coluna ,linha).posicionar());
	}
	
	private void configuracaoInicial() {	
		colocarNovaPeca('c', 1, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('c', 2, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('d', 2, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('e', 2, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('e', 1, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('d', 1, new Rei(tabuleiro, Cor.BRANCO));

		colocarNovaPeca('c', 7, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('c', 8, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('d', 7, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('e', 7, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('e', 8, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('d', 8, new Torre(tabuleiro, Cor.PRETO));
	}
	
}
