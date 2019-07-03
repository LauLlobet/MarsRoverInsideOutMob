import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class PlateauShould {

    @Test
    public void provide_postions_Next_to_it() {

        Plateau plateau = new Plateau(3,3);//0

        plateau.moveNord();//1
        plateau.moveNord();//2
        plateau.moveNord();//0
        plateau.moveNord();//1

        String actualPosition = plateau.getPosition();
        assertEquals("0,1",actualPosition);
    }
}