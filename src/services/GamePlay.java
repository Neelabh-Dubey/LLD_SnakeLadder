package services;

import models.Player;

import java.util.LinkedList;
import java.util.Queue;

public class GamePlay {
    GameSetUp gameSetUp;
    Queue<Player> playerQueue;
    Queue<Player> winnersQueue;

    int playersRemaining;

    public GamePlay(GameSetUp gameSetUp, int playersRemaining){
        this.gameSetUp = gameSetUp;
        this.playersRemaining = playersRemaining;
        playerQueue = new LinkedList<>(gameSetUp.players);
        winnersQueue = new LinkedList<>();
    }

    public void play(){
        while(playerQueue.size()>playersRemaining){
            Player player = playerQueue.poll();
            int initPos = player.getPos();
            int count = gameSetUp.dice.getThrow();
            while(initPos==0 || gameSetUp.board.getSpotList().get(initPos))
        }
    }


}
