public class RoverPosition {
    private int yPosition = 0;
    private WrapAroundCoordinateAxis wrappedYAxis ;
    private int xPosition = 0;
    private WrapAroundCoordinateAxis wrappedXAxis;

    public RoverPosition(int width, int height) {
        wrappedYAxis = new WrapAroundCoordinateAxis(height);
        wrappedXAxis = new WrapAroundCoordinateAxis(width);
    }

    public void moveNord() {
        yPosition = wrappedYAxis.increase(yPosition);
    }

    public String getPosition() {
        return xPosition+","+ yPosition;
    }

    public void moveSouth() {
        yPosition = wrappedYAxis.decrease(yPosition);
    }

    public void moveEast() {
        xPosition = wrappedXAxis.increase(xPosition);
    }

    public void moveWest() {
        xPosition = wrappedXAxis.decrease(xPosition);
    }
}
