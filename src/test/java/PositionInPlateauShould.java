import org.junit.Test;

import static org.junit.Assert.*;

public class PositionInPlateauShould {

    @Test
    public void provide_postions_Next_to_it() {

        PositionInPlateau positionInPlateau = new PositionInPlateau(4,3, 0,0 );//0

        positionInPlateau.moveNorth();//1
        positionInPlateau.moveNorth();//2
        positionInPlateau.moveNorth();//0
        positionInPlateau.moveNorth();//1

        positionInPlateau.moveSouth();//0
        positionInPlateau.moveSouth();//2
        positionInPlateau.moveSouth();//1
        positionInPlateau.moveSouth();//0

        positionInPlateau.moveEast();//1
        positionInPlateau.moveEast();//2
        positionInPlateau.moveEast();//3

        positionInPlateau.moveWest();//2
        positionInPlateau.moveWest();//1
        positionInPlateau.moveWest();//0
        positionInPlateau.moveWest();//3

        String actualPosition = positionInPlateau.getPosition();
        assertEquals("3,0",actualPosition);
    }


    @Test
    public void not_move_if_theres_an_obstacle() {

        PositionInPlateau positionInPlateau = new PositionInPlateau(10,10, 0, 0);

        positionInPlateau.setObstacle("1,0");
        positionInPlateau.setObstacle("0,1");
        positionInPlateau.setObstacle("9,0");
        positionInPlateau.setObstacle("0,9");
        positionInPlateau.moveEast(); // 1,0
        assertEquals("0,0", positionInPlateau.getPosition());
        positionInPlateau.moveNorth();
        assertEquals("0,0", positionInPlateau.getPosition());
        positionInPlateau.moveWest();
        assertEquals("0,0", positionInPlateau.getPosition());
        positionInPlateau.moveSouth();
        assertEquals("0,0", positionInPlateau.getPosition());
    }
}