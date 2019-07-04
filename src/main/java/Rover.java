public class Rover {
    private PositionManager positionManager;
    private boolean isTurnLeft = false;

    public Rover(PositionManager positionManager) {
        this.positionManager = positionManager;
    }

    public String getPosition() {
        return positionManager.getPosition();
    }

    public void move() {
        if(isTurnLeft) {
            positionManager.moveWest();
            return;
        }
        positionManager.moveNorth();
    }

    public void turnLeft() {
        isTurnLeft = true;
    }
}
