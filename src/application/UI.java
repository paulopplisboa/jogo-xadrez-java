package application;

import chess.ChessPiece;

public class UI {

	// metodo para imprimir todas as peças do tabuleiro
	public static void printBoard(ChessPiece[][] pieces) {

		for (int i = 0; i < pieces.length; i++) {
			System.out.print(8 - i + " ");

			// piece.lenght para o j considerando que a matriz é quadrada
			for (int j = 0; j < pieces.length; j++) {

				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");

	}

	// método para imprimir uma peça no tabuleiro
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
			
	}
}
