package chess;

import java.awt.Color;

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
	
	public ChessPiece[][] getPieces() {
	
	ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
	
	for (int i=0; i<board.getRows();i++) {
		
		for (int j=0; j<board.getColums();j++) {
			mat[i][j]= (ChessPiece) board.piece(i,j);
		}
	}
	return mat;
	
	}
	// método para colocar as peças no tabuleiro no inicio do jogo
	private void initialSetup() {
		board.placePiece(new Rook (board, chess.Color.WHIT), new Position(2,1));
		board.placePiece(new King (board, chess.Color.BLACK), new Position (0,4));
		board.placePiece(new King (board, chess.Color.WHIT), new Position (7,4));
	}
}
