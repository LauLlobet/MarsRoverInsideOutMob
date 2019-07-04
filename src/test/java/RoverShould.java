import org.junit.Test;

import static org.junit.Assert.*;

public class RoverShould {
    @Test
    public void move(){
        Rover rover = new Rover(new PositionManager(10,10));

        rover.move();
        rover.move();

        String position = rover.getPosition();
        assertEquals("0,2",position);
    }
}