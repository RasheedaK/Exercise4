import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {
    @Test
    public void testForValidPositionOfGrid() {
        Grid grid = new Grid(4, 5);
        Position position = new Position(3, 2);
        assertTrue(grid.isValidPosition(position));
    }

    @Test
    public void testForInValidPositionOfGrid() {
        Grid grid = new Grid(4, 5);
        Position position = new Position(5, 5);
        assertFalse(grid.isValidPosition(position));
    }
}