package models;

import java.util.UUID;

public class Player {
    String name;
    String id;
    int pos;

    public Player(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.pos = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
