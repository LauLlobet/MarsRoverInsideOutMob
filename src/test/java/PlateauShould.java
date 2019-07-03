import org.junit.Test;

import static org.junit.Assert.*;

public class PlateauShould {
    @Test
    public void provide_postion_at_West() {
        Plateau plateau = new Plateau();

        int expectedPosition = plateau.positionAtWest(1);

        assertEquals(expectedPosition,0);
    }
}