import org.junit.Test;

import static org.junit.Assert.*;

public class EastTest {
    @Test
    public void shouldReturnSouthAsRightDirectionForEast() {
        South south = new South();
        assertEquals(south.toString(), new East().getRightDirection().toString());
    }

    @Test
    public void shouldReturnNorthAsLeftDirectionForEast() {
        North north = new North();
        assertEquals(north.toString(), new East().getLeftDirection().toString());
    }

    @Test
    public void shouldNotReturnEastAsRightDirectionForEast() {
        East east = new East();
        assertNotEquals(east.toString(), new East().getRightDirection().toString());
    }

    @Test
    public void shouldNotReturnWestAsLeftDirectionForEast() {
        West west = new West();
        assertNotEquals(west.toString(), new East().getLeftDirection().toString());
    }
}