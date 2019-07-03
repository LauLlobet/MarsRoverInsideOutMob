public class Plateau {
    private int yPosition = 0;
    private WrapAroundCoordinateAxis wrappedYAxis ;

    public Plateau(int i, int i1) {
        wrappedYAxis = new WrapAroundCoordinateAxis(i1);
    }

    public void moveNord() {
        yPosition = wrappedYAxis.increase(yPosition);
    }

    public String getPosition() {
        return "0,"+ yPosition;
    }
}
