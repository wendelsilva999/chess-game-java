package boardgame;

public class Position {
	
	//aqui crio a class position que tem linha e coluna
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	// esse to string e para imprimir a posição na tela
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
