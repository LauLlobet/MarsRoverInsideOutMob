public class Rover {
    public static final int WEST = 1;
    public static final int SOUTH = 2;
    public static final int EAST = 3;
    public static final int NORTH = 0;

    private PositionInPlateau positionInPlateau;
    private int face = 0;

    public Rover(PositionInPlateau positionInPlateau) {
        this.positionInPlateau = positionInPlateau;
    }

    public String getPosition() {
        return positionInPlateau.getPosition();
    }

    public void move() {
        if(face == WEST) {
            positionInPlateau.moveWest();
            return;
        }
        if(face == SOUTH) {
            positionInPlateau.moveSouth();
            return;
        }
        if(face == EAST){
            positionInPlateau.moveEast();
            return;
        }
        positionInPlateau.moveNorth();
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
