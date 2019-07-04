public class Rover {
    public static final int WEST = 1;
    public static final int SOUTH = 2;
    public static final int EAST = 3;
    public static final int NORTH = 0;

    private PositionManager positionManager;
    private int face = 0;

    public Rover(PositionManager positionManager) {
        this.positionManager = positionManager;
    }

    public String getPosition() {
        return positionManager.getPosition();
    }

    public void move() {
        if(face == WEST) {
            positionManager.moveWest();
            return;
        }
        if(face == SOUTH) {
            positionManager.moveSouth();
            return;
        }
        if(face == EAST){
            positionManager.moveEast();
            return;
        }
        positionManager.moveNorth();
    }

    public void turnLeft() {
        face++;
        if(face > EAST){
            face = NORTH;
        }
    }

    public void turnRight() {
        face--;
        if(face < NORTH){
            face = EAST;
        }
    }
}
