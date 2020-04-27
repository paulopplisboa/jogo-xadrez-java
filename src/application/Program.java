package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMath;

public class Program {

	public static void main(String[] args) {
	
		ChessMath chessMath= new ChessMath();
		
		// Função para imprimir as peças da partida (Classe UI e metodo printBoard)
		UI.printBoard(chessMath.getPieces());
		
		//Board boar = new Board (8,8);
		//System.out.println(boar.toString());
		
		//Position pos = new Position (3,5);
		//System.out.println(pos);
		
		
	
	}

}
