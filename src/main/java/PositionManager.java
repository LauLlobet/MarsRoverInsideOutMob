import java.util.ArrayList;
import java.util.List;

public class PositionManager {
    private int yPosition = 0;
    private WrapAroundCoordinateAxis wrappedYAxis ;
    private int xPosition = 0;
    private WrapAroundCoordinateAxis wrappedXAxis;
    private List obstacles = new ArrayList();

    public PositionManager(int width, int height) {
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

    public String getPosition()
    {
        return xPosition + "," + yPosition;
    }

    public void moveSouth() {
        yPosition = wrappedYAxis.decrease(yPosition);
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
        xPosition = wrappedXAxis.decrease(xPosition);
    }

    public void setObstacle(String s) {
        obstacles.add(s);
    }
}
