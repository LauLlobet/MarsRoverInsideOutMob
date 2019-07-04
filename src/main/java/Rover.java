public class Rover {
    private PositionManager positionManager;
    private int face = 0;

    public Rover(PositionManager positionManager) {
        this.positionManager = positionManager;
    }

    public String getPosition() {
        return positionManager.getPosition();
    }

    public void move() {
        if(face == 1) {
            positionManager.moveWest();
            return;
        }
        if(face ==2) {
            positionManager.moveSouth();
            return;
        }
        if(face == 3){
            positionManager.moveEast();
            return;
        }
        positionManager.moveNorth();
    }

    public void turnLeft() {
        face++;
        if(face > 3){
            face = 0;
        }
    }

    public void turnRight() {
        face--;
    }
}
