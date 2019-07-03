public class WrapAroundCoordinateAxis {
    public static final int OUTSIDE_OF_LOWER_BOUND = -1;
    public static final int MOVE_WEST = -1;
    public static final int MOVE_EAST = 1;
    private int width;

    public WrapAroundCoordinateAxis(int width) {
        this.width = width;
    }

    public int positionAtWestOf(int position) {
        return wrapAroundIfNecesary(position + MOVE_WEST);
    }

    public int positionAtEastOf(int position) {
        return wrapAroundIfNecesary(position + MOVE_EAST);
    }

    private int wrapAroundIfNecesary(int position) {
        if(position == OUTSIDE_OF_LOWER_BOUND){
            position = width - 1;
        }
        if(position == width) {
            position = 0;
        }
        return position;
    }
}
