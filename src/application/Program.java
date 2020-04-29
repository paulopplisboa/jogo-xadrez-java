package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMath = new ChessMatch();
		Scanner sc = new Scanner(System.in);

		// Fun��o para imprimir as pe�as da partida (Classe UI e metodo printBoard)

		while (true) {

			UI.printBoard(chessMath.getPieces());
			System.out.println();
			System.out.println("Origem: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.println("Destino: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturePiece = chessMath.performChessMove(source, target);

		}
	}

}
