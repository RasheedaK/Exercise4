import org.junit.Test;

import static org.junit.Assert.*;

public class WestTest {
    @Test
    public void shouldReturnNorthAsRightDirectionForWest() {
        North north = new North();
        assertEquals(north.toString(), new West().getRightDirection().toString());
    }

    @Test
    public void shouldReturnSouthAsLeftDirectionForWest() {
        South south = new South();
        assertEquals(south.toString(), new West().getLeftDirection().toString());
    }

    @Test
    public void shouldNotReturnEastAsRightDirectionForWest() {
        East east = new East();
        assertNotEquals(east.toString(), new West().getRightDirection().toString());
    }

    @Test
    public void shouldNotReturnWestAsLeftDirectionForWest() {
        West west = new West();
        assertNotEquals(west.toString(), new West().getLeftDirection().toString());
    }
}