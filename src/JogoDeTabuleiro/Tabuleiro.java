package JogoDeTabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1) {
			throw new ExcessaoDeTabuleiro("Erro ao criar tabuleiro: deve haver pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int pegarLinhas() {
		return linhas;
	}

	public int pegarColunas() {
		return colunas;
	}

	public Peca peca(int linha , int coluna) {
		if(!posicaoExiste(linha,coluna)) {
			throw new ExcessaoDeTabuleiro("posicao fora do tabuleiro ");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new ExcessaoDeTabuleiro("posicao fora do tabuleiro ");
		}
		return pecas[posicao.pegarLinha()][posicao.pegarColuna()];
	}
	
	public void lugarDaPeca(Peca peca, Posicao posicao) {
		if(lugarDaPeca(posicao)) {
			throw new ExcessaoDeTabuleiro("ja existe uma peca na posicao: " + posicao);
		}
		pecas[posicao.pegarLinha()][posicao.pegarColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste(int linha,int coluna ) {
		return linha >= 0 && coluna < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.pegarLinha() , posicao.pegarColuna());
	}
	
	public boolean lugarDaPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new ExcessaoDeTabuleiro("posicao fora do tabuleiro ");
		}
		return peca(posicao) != null;
	}
	
}
