package xadrez;



import JogoDeTabuleiro.Peca;
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
	
	
	public PecaDeXadrez executarJogadaDeXadrez(PosicaoDeXadrez posicaoOrigem , PosicaoDeXadrez posicaoDestino ) {
		Posicao origem = posicaoOrigem.posicionar();
		Posicao destino = posicaoDestino.posicionar();
		validacaoPosicaoOrigem(origem);	
		Peca pecaCapturada = fazerMover(origem , destino);
		return (PecaDeXadrez) pecaCapturada;
	}
	
	private Peca fazerMover(Posicao origem , Posicao destino) {
		Peca p = tabuleiro.removerPeca(origem);
		Peca pecaCapturada = tabuleiro.removerPeca(destino);
		tabuleiro.lugarDaPeca( p ,destino);
		return pecaCapturada;
	}
	
	
	private void validacaoPosicaoOrigem(Posicao posicao) {
		if(!tabuleiro.lugarDaPeca(posicao)) {
			throw new ExcessaoDeXadrez("nao ha peca na posicao de origem");
		}
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
