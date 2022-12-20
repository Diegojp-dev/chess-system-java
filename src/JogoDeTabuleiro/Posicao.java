package JogoDeTabuleiro;

public class Posicao {

	private int linha;
	private int coluna;
	
	public Posicao(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public int pegarLinha() {
		return linha;
	}

	public void definirLinha(int linha) {
		this.linha = linha;
	}

	public int pegarColuna() {
		return coluna;
	}

	public void definirColuna(int coluna) {
		this.coluna = coluna;
	}

	@Override
	public String toString() {
		return linha + ", " + coluna;
	}
	
	
}
