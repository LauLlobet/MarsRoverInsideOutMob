import java.util.ArrayList;
import java.util.List;

public class PositionInPlateau {
    private int yPosition;
    private WrapAroundCoordinateAxis wrappedYAxis ;
    private int xPosition;
    private WrapAroundCoordinateAxis wrappedXAxis;
    private List obstacles = new ArrayList();

    public PositionInPlateau(int width, int height, int x, int y) {
        xPosition = x;
        yPosition = y;
        wrappedYAxis = new WrapAroundCoordinateAxis(height);
        wrappedXAxis = new WrapAroundCoordinateAxis(width);
    }

    public void moveNorth() {
        int increase = wrappedYAxis.increase(yPosition);
        if(obstacles.contains(xPosition+","+increase)){
            return;
        }
        yPosition = increase;
    }

    public String getPosition() {
        return xPosition + "," + yPosition;
    }

    public void moveSouth() {
        int decrease = wrappedYAxis.decrease(yPosition);
        if(obstacles.contains(xPosition+","+decrease)){
            return;
        }
        yPosition = decrease;
    }

    public void moveEast() {
        int increase = wrappedXAxis.increase(xPosition);
        if(obstacles.contains(increase +","+yPosition)){
            return;
        }
        xPosition = increase;
    }

    public void moveWest() {
        int decrease = wrappedXAxis.decrease(xPosition);
        if(obstacles.contains(decrease+","+yPosition)){
            return;
        }
        xPosition = decrease;
    }

    public void setObstacle(String s) {
        obstacles.add(s);
    }
}
