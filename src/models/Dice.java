package models;

import java.util.Random;

public class Dice {
    int count;
    final int diceSize = 6;
    public Dice(int dice){
        this.count = diceSize*dice;
    }

    public int getThrow(){
        Random random = new Random(count-1);
        return random.nextInt()+1;
    }
}
