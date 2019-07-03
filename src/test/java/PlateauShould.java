import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class PlateauShould {

    @Test
    public void provide_postions_Next_to_it() {

        Plateau plateau = new Plateau(10,10);

        plateau.moveNord();

        String actualPosition = plateau.getPosition();
        assertEquals("0,1",actualPosition);
    }
}