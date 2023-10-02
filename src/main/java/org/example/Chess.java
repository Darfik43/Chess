package org.example;

import org.example.board.Board;
import org.example.board.BoardFactory;

public class Chess {
    public static void main(String[] args) {
//        Board board = new Board();
//        board.setupDefaultPiecesPositions();

        Board board = (new BoardFactory()).fromFEN(
                "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1"

        );

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
        Game game = new Game(board);
        game.gameLoop();
    }
}