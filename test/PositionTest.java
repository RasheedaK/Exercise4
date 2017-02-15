import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {
    @Test
    public void testEqualPositions() {
        Position position = new Position(1, 2);
        Position position1 = new Position(1, 2);
        assertEquals(position, position1);
    }

    @Test
    public void testUnEqualPositions() {
        Position position = new Position(2, 2);
        Position position1 = new Position(1, 2);
        assertNotEquals(position, position1);
    }

    @Test
    public void tes22NAsRightPositionFor12N() {
        Position position = new Position(1, 2);
        Position expectedPosition = new Position(2, 2);
        assertEquals(expectedPosition, position.getRightPosition());
    }

    @Test
    public void tes02NAsLeftPositionFor12N() {
        Position position = new Position(1, 2);
        Position expectedPosition = new Position(0, 2);
        assertEquals(expectedPosition, position.getLeftPosition());
    }

    @Test
    public void tes13NAsTopPositionFor12N() {
        Position position = new Position(1, 2);
        Position expectedPosition = new Position(1, 3);
        assertEquals(expectedPosition, position.getTopPosition());
    }

    @Test
    public void tes13NAsDownPositionFor12N() {
        Position position = new Position(1, 2);
        Position expectedPosition = new Position(1, 1);
        assertEquals(expectedPosition, position.getDownPosition());
    }


}