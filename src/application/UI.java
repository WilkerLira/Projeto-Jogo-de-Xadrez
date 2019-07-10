package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] piece) {
		for (int linha = 0; linha < piece.length; linha++) {
			System.out.print((8 - linha) + " ");
			
			for (int coluna = 0; coluna < piece.length; coluna++) {
				printPiece(piece[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		
		}else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
