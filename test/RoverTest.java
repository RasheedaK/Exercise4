import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RoverTest {
    @Test
    public void returnNotEqualsIfRoverPosition12AndRoverIsAt22() {
        Position position = new Position(1, 2);
        Position roverPosition = new Position(2, 2);
        Rover rover = new Rover(roverPosition);
        assertNotEquals(position, rover.getPosition());
    }
    @Test
    public void returnEqualsIfRoverPosition12AndRoverIsAt12() {
        Position position = new Position(1, 2);
        Rover rover = new Rover(position);
        assertEquals(position, rover.getPosition());
    }
}