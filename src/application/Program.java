package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMath = new ChessMatch();

		// Fun��o para imprimir as pe�as da partida (Classe UI e metodo printBoard)
		UI.printBoard(chessMath.getPieces());

	}

}
