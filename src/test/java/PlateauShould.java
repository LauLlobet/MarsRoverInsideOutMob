import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class PlateauShould {

    @Test
    public void provide_postions_Next_to_it() {

        Plateau plateau = new Plateau(3,3);

        plateau.moveNord();
        plateau.moveNord();
        plateau.moveNord();
        plateau.moveNord();

        String actualPosition = plateau.getPosition();
        assertEquals("0,0",actualPosition);
    }
}