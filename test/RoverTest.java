import com.sun.media.sound.InvalidFormatException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoverTest {
    @Test
    public void testPosition12IfRoverIsAt11NForInstrutionM() throws InvalidFormatException {
        Position roverPosition = new Position(1, 1);
        Direction direction = new North();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        rover.explore("M", grid, directionTeller);
        String expectedString = "1 2";
        assertEquals(expectedString, rover.getPosition());
    }

    @Test
    public void testPosition02IfRoverIsAt12WForInstrutionM() throws InvalidFormatException{
        Position roverPosition = new Position(1, 2);
        Direction direction = new West();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        rover.explore("M", grid, directionTeller);
        String expectedString = "0 2";
        assertEquals(expectedString, rover.getPosition());
    }

    @Test
    public void testPosition31IfRoverIsAt32SForInstrutionM() throws InvalidFormatException{
        Position roverPosition = new Position(3, 2);
        Direction direction = new South();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        rover.explore("M", grid, directionTeller);
        String expectedString = "3 1";
        assertEquals(expectedString, rover.getPosition());
    }

    @Test
    public void testPosition42IfRoverIsAt32EForInstrutionM() throws InvalidFormatException{
        Position roverPosition = new Position(3, 2);
        Direction direction = new East();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        rover.explore("M", grid, directionTeller);
        String expectedString = "4 2";
        assertEquals(expectedString, rover.getPosition());
    }

    @Test
    public void testDirectionNIfRoverIsAt32EForInstrutionL() throws InvalidFormatException{
        Position roverPosition = new Position(3, 2);
        Direction direction = new East();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        rover.explore("L", grid, directionTeller);
        assertEquals("N", rover.getDirection());
    }

    @Test
    public void testDirectionSIfRoverIsAt32WForInstrutionL() throws InvalidFormatException{
        Position roverPosition = new Position(3, 2);
        Direction direction = new West();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        rover.explore("L", grid, directionTeller);
        assertEquals("S", rover.getDirection());
    }

    @Test
    public void testDirectionWIfRoverIsAt32NForInstrutionL() throws InvalidFormatException{
        Position roverPosition = new Position(3, 2);
        Direction direction = new North();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        rover.explore("L", grid, directionTeller);
        assertEquals("W", rover.getDirection());
    }

    @Test
    public void testDirectionEIfRoverIsAt32SForInstrutionL() throws InvalidFormatException{
        Position roverPosition = new Position(3, 2);
        Direction direction = new South();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        rover.explore("L", grid, directionTeller);
        assertTrue("E" == rover.getDirection());
    }
    @Test
    public void testPosition13IfRoverIsAt12NForInstrutionLMLMLMLMM() throws InvalidFormatException{
        Position roverPosition = new Position(1, 2);
        Direction direction = new North();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        rover.explore("LMLMLMLMM", grid, directionTeller);
        assertEquals("1 3",rover.getPosition());
    }
    @Test(expected = InvalidFormatException.class)
    public void testDirectionEIfRoverIsAt32SForInstrutionLMK() throws InvalidFormatException{
        Position roverPosition = new Position(3, 2);
        Direction direction = new South();
        Rover rover = new Rover(roverPosition, direction);
        Grid grid = new Grid(5, 5);
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        rover.explore("LMK", grid, directionTeller);
    }
}