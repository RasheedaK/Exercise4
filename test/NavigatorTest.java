import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NavigatorTest {
    @Test
    public void shouldReturnPositonAs12NIfRoverIsAt12EForInstructionL() {
        Position roverPosition=new Position(1,2, 'E');
        Position position=new Position(1,2, 'N');
        Rover rover=new Rover(roverPosition);
        Navigator navigator=new Navigator();
        assertEquals(position,navigator.move(rover.getPosition(),"L"));
    }
    @Test
    public void shouldNotReturnPositonAs12EIfRoverIsAt12EForInstructionL() {
        Position roverPosition=new Position(1,2, 'E');
        Position position=new Position(1,2, 'E');
        Rover rover=new Rover(roverPosition);
        Navigator navigator=new Navigator();
        assertNotEquals(position,navigator.move(rover.getPosition(),"L"));
    }
    @Test
    public void shouldReturnPositonAs12SIfRoverIsAt12EForInstructionR() {
        Position roverPosition=new Position(1,2, 'E');
        Position position=new Position(1,2, 'S');
        Rover rover=new Rover(roverPosition);
        Navigator navigator=new Navigator();
        assertEquals(position,navigator.move(rover.getPosition(),"R"));
    }
    @Test
    public void shouldReturnPositonAs14NIfRoverIsAt14WForInstructionR() {
        Position roverPosition=new Position(1,4, 'W');
        Position position=new Position(1,4, 'N');
        Rover rover=new Rover(roverPosition);
        Navigator navigator=new Navigator();
        assertEquals(position,navigator.move(rover.getPosition(),"R"));
    }
    @Test
    public void shouldReturnPositonAs04WIfRoverIsAt14WForInstructionM() {
        Position roverPosition=new Position(1,4, 'W');
        Position position=new Position(0,4, 'W');
        Rover rover=new Rover(roverPosition);
        Navigator navigator=new Navigator();
        assertEquals(position,navigator.move(rover.getPosition(),"M"));
    }
}