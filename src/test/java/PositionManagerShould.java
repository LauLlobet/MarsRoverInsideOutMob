import org.junit.Test;

import static org.junit.Assert.*;

public class PositionManagerShould {

    @Test
    public void provide_postions_Next_to_it() {

        PositionManager positionManager = new PositionManager(4,3);//0

        positionManager.moveNorth();//1
        positionManager.moveNorth();//2
        positionManager.moveNorth();//0
        positionManager.moveNorth();//1

        positionManager.moveSouth();//0
        positionManager.moveSouth();//2
        positionManager.moveSouth();//1
        positionManager.moveSouth();//0

        positionManager.moveEast();//1
        positionManager.moveEast();//2
        positionManager.moveEast();//3

        positionManager.moveWest();//2
        positionManager.moveWest();//1
        positionManager.moveWest();//0
        positionManager.moveWest();//3

        String actualPosition = positionManager.getPosition();
        assertEquals("3,0",actualPosition);
    }
}