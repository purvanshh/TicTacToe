package Controller;


import Exceptions.InvalidMove;
import Models.Game;
import Models.GameState;
import Models.Player;

import java.util.List;

public class movecontroller {
    public Game startGame(int dimension, List<Player> players) {
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMove {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
    
}
