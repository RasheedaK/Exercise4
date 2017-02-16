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
    public void test22NAsRightPositionFor12() {
        Position position = new Position(1, 2);
        Position expectedPosition = new Position(2, 2);
        Grid grid=new Grid(5,5);
        assertEquals(expectedPosition, position.getRightPosition(position,grid));
    }

    @Test
    public void test02NAsLeftPositionFor12() {
        Position position = new Position(1, 2);
        Position expectedPosition = new Position(0, 2);
        Grid grid=new Grid(5,5);
        assertEquals(expectedPosition, position.getLeftPosition(position,grid));
    }

    @Test
    public void test13NAsTopPositionFor12() {
        Position position = new Position(1, 2);
        Position expectedPosition = new Position(1, 3);
        Grid grid=new Grid(5,5);
        assertEquals(expectedPosition, position.getTopPosition(position,grid));
    }

    @Test
    public void test13NAsDownPositionFor12() {
        Position position = new Position(1, 2);
        Position expectedPosition = new Position(1, 1);
        Grid grid=new Grid(5,5);
        assertEquals(expectedPosition, position.getDownPosition(position,grid));
    }
    @Test
    public void test3AsXcoordinateForPosition32() {
        Position position = new Position(3, 2);
        assertTrue(3==position.getXcoordinate());
    }@Test
    public void test4AsYcoordinateForPosition24() {
        Position position = new Position(2, 4);
        assertTrue(4==position.getYcoordinate());
    }


}