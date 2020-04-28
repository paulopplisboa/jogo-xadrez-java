package chess;

import boardgame.Board;
import boardgame.Position;
import chess.piece.King;
import chess.piece.Rook;

public class ChessMath {
	
	private Board board;
	
	public ChessMath() 	{
		board = new Board(8,8);	
		initialSetup();
	}
	
	// método para retornar um conjunto de peças de xadrez
	public ChessPiece[][] getPieces() {
	
	ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
	
	for (int i=0; i<board.getRows();i++) {
		
		for (int j=0; j<board.getColums();j++) {
			mat[i][j]= (ChessPiece) board.piece(i,j);
		}
	}
	return mat;
	
	}
	
	private void placeNewPiece (char colum, int row, ChessPiece piece) {
		
		board.placePiece(piece, new ChessPosition(colum,row).toPosition());
	}
	
	// método para colocar as peças no tabuleiro no inicio do jogo
	private void initialSetup() {
		placeNewPiece('b',6, new Rook (board, Color.WHITE));
		placeNewPiece('e',8, new King (board, Color.BLACK));
		placeNewPiece('e',1, new King  (board, Color.WHITE));
	}
}
