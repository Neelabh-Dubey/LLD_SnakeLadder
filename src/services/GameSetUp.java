package services;

import models.*;

import java.util.List;

public class GameSetUp {
    Board board;
    List<Player>players;
    List<Snake>snakes;
    List<Ladder>ladders;
    Dice dice;

    void setBoard(int spots){
        board = new Board(spots);
    }
    void setPlayers(List<Player>players){
        this.players = players;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public void setDice(int dice) {
        this.dice = new Dice(dice);
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public void gameSetup(){
        board.addSnakes(snakes);
        board.addLadders(ladders);
    }
}
