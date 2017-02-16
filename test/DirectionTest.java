import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionTest {
    @Test
    public void testForGettingNorthDirectionOnCallinggetNorth() {
        Direction north = new Direction('N');
        Direction direction = new Direction('N');
        assertEquals(north, direction.getNorth());
    }

    @Test
    public void testForGettingSouthDirectionOnCallinggetSouth() {
        Direction north = new Direction('S');
        Direction direction = new Direction('S');
        assertEquals(north, direction.getSouth());
    }

    @Test
    public void testForGettingEastDirectionOnCallinggetEast() {
        Direction north = new Direction('E');
        Direction direction = new Direction('E');
        assertEquals(north, direction.getEast());
    }

    @Test
    public void testForGettingWestDirectionOnCallinggetWest() {
        Direction north = new Direction('W');
        Direction direction = new Direction('W');
        assertEquals(north, direction.getWest());
    }
}