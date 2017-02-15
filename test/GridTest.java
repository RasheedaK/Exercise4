import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {
    @Test
    public void testForMaxXCoordinateOfGrid() {
        Grid grid=new Grid(4,5);
        assertTrue(4==grid.getMaxXCoordinate());
    }
    @Test
    public void testForMaxYCoordinateOfGrid() {
        Grid grid=new Grid(4,5);
        assertTrue(5==grid.getMaxYCoordinate());
    }
}