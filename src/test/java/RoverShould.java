import org.junit.Test;

import static org.junit.Assert.*;

public class RoverShould {
    @Test
    public void move(){
        Rover rover = new Rover(new PositionInPlateau(10,10, 0, 0));

        rover.move(); // N 0 1
        rover.move(); // N 0 2
        rover.turnLeft(); // W
        rover.move(); // W 9 2
        rover.turnLeft(); // S
        rover.move(); // S 9 1
        rover.turnRight(); // W
        rover.move(); // W 8 1
        rover.turnLeft(); // S
        rover.turnLeft(); // E
        rover.turnLeft(); // N
        rover.move();// N 8 2
        rover.turnRight(); // E
        rover.move();// E 9 2
        assertEquals("9,2", rover.getPosition());
    }
}