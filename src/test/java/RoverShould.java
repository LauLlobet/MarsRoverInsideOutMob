import org.junit.Test;

import static org.junit.Assert.*;

public class RoverShould {
    @Test
    public void move(){
        Rover rover = new Rover(new PositionManager(10,10));

        rover.move();
        rover.move();
        rover.turnLeft();
        rover.move();
        rover.turnLeft();
        rover.move();

        String position = rover.getPosition();
        assertEquals("9,1",position);
    }
}