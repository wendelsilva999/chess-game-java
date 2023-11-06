package boardgame;

public class Piece {
	//vamos ter algumas associações
	// protecte porque so quero que classe do mesmo pacote que posasam mexer no tabuleiro e não classes de fora
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
}
