import org.junit.Test;

import javax.swing.*;

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


    @Test
    public void not_move_if_theres_an_obstacle() {

        PositionManager positionManager = new PositionManager(10,10);

        positionManager.setObstacle("1,0");
        positionManager.setObstacle("0,1");
        positionManager.setObstacle("9,0");
        positionManager.setObstacle("0,9");
        positionManager.moveEast(); // 1,0
        assertEquals("0,0",positionManager.getPosition());
        positionManager.moveNorth();
        assertEquals("0,0",positionManager.getPosition());
        positionManager.moveWest();
        assertEquals("0,0",positionManager.getPosition());
       // positionManager.moveSouth();
        //assertEquals("0,0",positionManager.getPosition());
    }
}