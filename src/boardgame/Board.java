package boardgame;


public class Board {

	private int linha;
	private int coluna;
	
	private Piece[][] pieces;

	public Board(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public Piece piece (int linha, int coluna) {
		return pieces[linha][coluna];
	}
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColum()];
	}
	
}
