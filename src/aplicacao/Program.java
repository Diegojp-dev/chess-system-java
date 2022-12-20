package aplicacao;

import java.util.Scanner;

import xadrez.JogoDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoDeXadrez;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		JogoDeXadrez jogoDeXadrez = new JogoDeXadrez();
		
		
		while(true) {
			UI.placaDeImpressao(jogoDeXadrez.pegarPecas());
			System.out.println();
			System.out.print("origem: ");
			PosicaoDeXadrez origem = UI.lerPosicaoDeXadrez(sc);
			
			System.out.println();
			System.out.print("destino: ");
			PosicaoDeXadrez destino = UI.lerPosicaoDeXadrez(sc);
			
			PecaDeXadrez pecaCapturada = jogoDeXadrez.executarJogadaDeXadrez(origem, destino);
		}
		
		
	}

}
