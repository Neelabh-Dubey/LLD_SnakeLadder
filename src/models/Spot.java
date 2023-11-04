package models;

public class Spot {
    int pos;
    String snakeId;
    String ladderId;

    public int getPos() {
        return pos;
    }

    public String getSnakeId() {
        return snakeId;
    }

    public String getLadderId() {
        return ladderId;
    }

    public void setSnakeId(String snakeId) {
        this.snakeId = snakeId;
    }

    public void setLadderId(String ladderId) {
        this.ladderId = ladderId;
    }
}
