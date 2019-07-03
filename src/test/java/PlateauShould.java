import org.junit.Test;

import static org.junit.Assert.*;

public class PlateauShould {
    @Test
    public void provide_postion_at_West() {
        Plateau plateau = new Plateau(10);

        int nextpostion = plateau.positionAtWestOf(1);

        assertEquals(0, nextpostion);
    }

    @Test
    public void provide_position_at_West_from_another_point() {
        Plateau plateau = new Plateau(10);

        int nextposition = plateau.positionAtWestOf(2);

        assertEquals(1, nextposition);
    }

    @Test
    public void wrap_around_postions() {
        Plateau plateau = new Plateau(5);

        int nextposition = plateau.positionAtWestOf(0);

        assertEquals(4,nextposition);
    }

    @Test
    public void wrap_around_position_when_bigger_than_with() {
        Plateau plateau = new Plateau(5);

        int nextposition = plateau.positionAtEastOf(4);

        assertEquals(0,nextposition);
    }

    @Test
    public void provide_position_at_East_from_another_point() {
        Plateau plateau = new Plateau(10);

        int nextposition = plateau.positionAtEastOf(2);

        assertEquals(3, nextposition);
    }

}