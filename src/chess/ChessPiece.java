package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece peca = (ChessPiece)getBoard().piece(position);
		return peca != null && peca.getColor() != color;
	}
}
