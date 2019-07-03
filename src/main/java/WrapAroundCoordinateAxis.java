public class WrapAroundCoordinateAxis {
    public static final int OUTSIDE_OF_LOWER_BOUND = -1;
    public static final int DECREMENT = -1;
    public static final int INCREMENT = 1;
    private int size;

    public WrapAroundCoordinateAxis(int size) {
        this.size = size;
    }

    public int decrease(int position) {
        return wrapAroundIfNecesary(position + DECREMENT);
    }

    public int increase(int position) {
        return wrapAroundIfNecesary(position + INCREMENT);
    }

    private int wrapAroundIfNecesary(int position) {
        if(position == OUTSIDE_OF_LOWER_BOUND){
            position = size - 1;
        }
        if(position == size) {
            position = 0;
        }
        return position;
    }
}
