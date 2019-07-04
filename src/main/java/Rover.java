public class Rover {
    private PositionManager positionManager;

    public Rover(PositionManager positionManager) {
        this.positionManager = positionManager;
    }

    public String getPosition() {
        return positionManager.getPosition();
    }

    public void move() {
        positionManager.moveNorth();
    }
}
