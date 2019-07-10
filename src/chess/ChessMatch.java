package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int linha = 0; linha < board.getRows(); linha++) {
			for (int column = 0; column < board.getColumns(); column++) {
				mat[linha][column] = (ChessPiece)board.piece(linha, column);
			}
		}
		return mat;
	}

}
