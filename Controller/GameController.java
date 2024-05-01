package Controller;

import Exceptions.InvalidMoveException;
import Models.Game;
import Models.GameState;
import Models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players){
        //Validate if two players have same symbol
        //Throw some exception

        return new Game(dimension,players);
    }
    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }
    public GameState checkGameState(Game game){
        return game.getState();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
    public void printBaord(Game game){
        game.printBoard();
    }
}