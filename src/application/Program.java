package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new  ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.err.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.err.println();
			System.err.print("Target: ");
			ChessPosition targe = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.perfomChessMove(source, targe);
		}
	}

}
