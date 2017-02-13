import org.junit.Test;

import static org.junit.Assert.*;
public class PositionTest {
    @Test
    public void testEqualPositions() {
        Position position=new Position(1,2, 'N');
        Position position1=new Position(1,2, 'N');
        assertEquals(position,position1);
    }
    @Test
    public void testUnEqualPositions() {
        Position position=new Position(2,2, 'N');
        Position position1=new Position(1,2, 'N');
        assertNotEquals(position,position1);
    }
}