import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
   @Test
    public void testPosition12NIfRoverIsAt12EForInstrutionL() {
        Position roverPosition = new Position(1, 2, 'E');
        Rover rover = new Rover(roverPosition);
        rover.explore("L");
        String expectedString="1 2 N";
        assertEquals(expectedString,rover.getPosition());
    }
    @Test
    public void testPosition13NIfRoverIsAt12EForInstrutionM() {
        Position roverPosition = new Position(1, 2, 'N');
        Rover rover = new Rover(roverPosition);
        rover.explore("M");
        String expectedString="1 3 N";
        assertEquals(expectedString,rover.getPosition());
    }
    @Test
    public void testPosition32SIfRoverIsAt32EForInstrutionR() {
        Position roverPosition = new Position(3, 2, 'E');
        Rover rover = new Rover(roverPosition);
        rover.explore("R");
        String expectedString="3 2 S";
        assertEquals(expectedString,rover.getPosition());
    }
    @Test
    public void testPosition32SIfRoverIsAt32EForInstrutionRLLR() {
        Position roverPosition = new Position(3, 2, 'E');
        Rover rover = new Rover(roverPosition);
        rover.explore("R");
        String expectedString="3 2 S";
        assertEquals(expectedString,rover.getPosition());
    }
}