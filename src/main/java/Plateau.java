public class Plateau {
    public static final int OUTSIDE_OF_LOWER_BOUND = -1;
    public static final int MOVE_WEST = -1;
    private int width;

    public Plateau(int width) {
        this.width = width;
    }

    public int positionAtWestOf(int position) {
        return wrapAroundIfNecesary(position + MOVE_WEST);
    }

    private int wrapAroundIfNecesary(int position) {
        if(position == OUTSIDE_OF_LOWER_BOUND){
            position = width - 1;
        }
        return position;
    }

    public int positionAtEastOf(int i) {
        return 0;
    }
}
