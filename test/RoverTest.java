import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RoverTest {
    @Test
    public void testRoverPosition() {
        RoverPosition position = new RoverPosition(1, 2);
        Rover rover = new Rover(position);
        assertNotEquals(position, rover.getPosition());
    }
}