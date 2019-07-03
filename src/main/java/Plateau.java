public class Plateau {
    private int yPosition = 0;

    public Plateau(int i, int i1) {
    }

    public void moveNord() {
        yPosition++;
    }

    public String getPosition() {
        return "0,"+ yPosition;
    }
}
