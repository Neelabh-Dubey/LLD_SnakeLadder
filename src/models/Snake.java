package models;

import java.util.UUID;

public class Snake {
    String id;
    int start;
    int end;

    public Snake(int start, int end){
        this.id = UUID.randomUUID().toString();
        this.start = start;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
