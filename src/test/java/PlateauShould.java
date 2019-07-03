import org.junit.Test;

import static org.junit.Assert.*;

public class PlateauShould {
    @Test
    public void provide_postion_at_West() {
        Plateau plateau = new Plateau(10);

        int expectedPosition = plateau.positionAtWest(1);

        assertEquals(expectedPosition,0);
    }

    @Test
    public void provide_position_at_West_from_another_point() {
        Plateau plateau = new Plateau(10);

        int expectedPosition = plateau.positionAtWest(2);

        assertEquals(expectedPosition,1);
    }

    @Test
    public void wrap_around_postions() {
        Plateau plateau = new Plateau(5);

        int expectedPosition = plateau.positionAtWest(0);

        assertEquals(expectedPosition, 4);
    }
}