import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoverTest {
    @Test
    public void testPosition12IfRoverIsAt11NForInstrutionM() {
        Position roverPosition = new Position(1, 1);
        Direction direction = new Direction('N');
        Rover rover = new Rover(roverPosition, direction);
        Grid grid=new Grid(5,5);
        rover.explore("M",grid);
        String expectedString = "1 2";
        assertEquals(expectedString, rover.getPosition());
    }

    @Test
    public void testPosition02IfRoverIsAt12WForInstrutionM() {
        Position roverPosition = new Position(1, 2);
        Direction direction = new Direction('W');
        Rover rover = new Rover(roverPosition, direction);
        Grid grid=new Grid(5,5);
        rover.explore("M",grid);
        String expectedString = "0 2";
        assertEquals(expectedString, rover.getPosition());
    }

    @Test
    public void testPosition31IfRoverIsAt32SForInstrutionM() {
        Position roverPosition = new Position(3, 2);
        Direction direction = new Direction('S');
        Rover rover = new Rover(roverPosition, direction);
        Grid grid=new Grid(5,5);
        rover.explore("M",grid);
        String expectedString = "3 1";
        assertEquals(expectedString, rover.getPosition());
    }

    @Test
    public void testPosition42IfRoverIsAt32EForInstrutionM() {
        Position roverPosition = new Position(3, 2);
        Direction direction = new Direction('E');
        Rover rover = new Rover(roverPosition, direction);
        Grid grid=new Grid(5,5);
        rover.explore("M",grid);
        String expectedString = "4 2";
        assertEquals(expectedString, rover.getPosition());
    }

    @Test
    public void testDirectionNIfRoverIsAt32EForInstrutionL() {
        Position roverPosition = new Position(3, 2);
        Direction direction = new Direction('E');
        Rover rover = new Rover(roverPosition, direction);
        Grid grid=new Grid(5,5);
        rover.explore("L",grid);
        assertTrue('N' == rover.getDirection());
    }

    @Test
    public void testDirectionSIfRoverIsAt32WForInstrutionL() {
        Position roverPosition = new Position(3, 2);
        Direction direction = new Direction('W');
        Rover rover = new Rover(roverPosition, direction);
        Grid grid=new Grid(5,5);
        rover.explore("L",grid);
        assertTrue('S' == rover.getDirection());
    }

    @Test
    public void testDirectionWIfRoverIsAt32NForInstrutionL() {
        Position roverPosition = new Position(3, 2);
        Direction direction = new Direction('N');
        Rover rover = new Rover(roverPosition, direction);
        Grid grid=new Grid(5,5);
        rover.explore("L",grid);
        assertTrue('W' == rover.getDirection());
    }

    @Test
    public void testDirectionEIfRoverIsAt32SForInstrutionL() {
        Position roverPosition = new Position(3, 2);
        Direction direction = new Direction('S');
        Rover rover = new Rover(roverPosition, direction);
        Grid grid=new Grid(5,5);
        rover.explore("L",grid);
        assertTrue('E' == rover.getDirection());
    }
}