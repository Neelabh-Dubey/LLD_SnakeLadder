package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int spots;
    List<Spot>spotList;

    public Board(int spots){
        this.spots = spots;
        spotList = new ArrayList<>();
        for(int i=0;i<spots;i++){
            spotList.add(new Spot());
        }
    }

    public void addSnakes(List<Snake>snakeList){
        for(Snake snake:snakeList){
            spotList.get(snake.start-1).snakeId=snake.id;
        }
    }

    public void addLadders(List<Ladder>ladderList){
        for(Ladder ladder:ladderList){
            spotList.get(ladder.start-1).ladderId = ladder.id;
        }
    }

    public List<Spot> getSpotList() {
        return spotList;
    }
}
