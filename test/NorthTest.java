import org.junit.Test;

import static org.junit.Assert.*;

public class NorthTest {
    @Test
    public void shouldReturnEastAsRightDirectionForNorth() {
        East east = new East();
        assertEquals(east.toString(), new North().getRightDirection().toString());
    }

    @Test
    public void shouldReturnWestAsLeftDirectionForNorth() {
        West west = new West();
        assertEquals(west.toString(), new North().getLeftDirection().toString());
    }

    @Test
    public void shouldNotReturnSouthAsRightDirectionForNorth() {
        South south = new South();
        assertNotEquals(south.toString(), new North().getRightDirection().toString());
    }

    @Test
    public void shouldNotReturnEastAsLeftDirectionForNorth() {
        East east = new East();
        assertNotEquals(east.toString(), new North().getLeftDirection().toString());
    }
}