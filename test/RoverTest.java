import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RoverTest {
    @Test
    public void returnNotEqualsIfPositionIsAt12AndRoverIsAt22() {
        Position position = new Position(1, 2, 'N');
        Position roverPosition = new Position(2, 2, 'N');
        Rover rover = new Rover(roverPosition);
        assertNotEquals(position, rover.getPosition());
    }
    @Test
    public void returnEqualsIfPositionIsAt12AndRoverIsAt12() {
        Position position = new Position(1, 2, 'W');
        Rover rover = new Rover(position);
        assertEquals(position, rover.getPosition());
    }
}