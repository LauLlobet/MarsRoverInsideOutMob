public class Plateau {
    private int width;

    public Plateau(int width) {
        this.width = width;
    }

    public int positionAtWest(int position) {
        int result = position - 1;
        if(result == -1){
            result = width - 1;
        }
        return result;
    }
}
