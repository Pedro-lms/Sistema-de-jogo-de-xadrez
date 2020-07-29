package chess.pieces;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {
	public Bishop(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "BS";
	}

}
