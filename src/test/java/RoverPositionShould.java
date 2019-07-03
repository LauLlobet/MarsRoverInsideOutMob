import org.junit.Test;

import static org.junit.Assert.*;

public class RoverPositionShould {

    @Test
    public void provide_postions_Next_to_it() {

        RoverPosition roverPosition = new RoverPosition(4,3);//0

        roverPosition.moveNord();//1
        roverPosition.moveNord();//2
        roverPosition.moveNord();//0
        roverPosition.moveNord();//1

        roverPosition.moveSouth();//0
        roverPosition.moveSouth();//2
        roverPosition.moveSouth();//1
        roverPosition.moveSouth();//0

        roverPosition.moveEast();//1
        roverPosition.moveEast();//2
        roverPosition.moveEast();//3

        roverPosition.moveWest();//2
        roverPosition.moveWest();//1
        roverPosition.moveWest();//0
        roverPosition.moveWest();//3

        String actualPosition = roverPosition.getPosition();
        assertEquals("3,0",actualPosition);
    }
}