import org.junit.Test;

import static org.junit.Assert.*;

public class SouthTest {
    @Test
    public void shouldReturnWestAsRightDirectionForSouth() {
        West west = new West();
        assertEquals(west.toString(), new South().getRightDirection().toString());
    }

    @Test
    public void shouldReturnEastAsLeftDirectionForSouth() {
        East east = new East();
        assertEquals(east.toString(), new South().getLeftDirection().toString());
    }

    @Test
    public void shouldNotReturnEastAsRightDirectionForSouth() {
        East east = new East();
        assertNotEquals(east.toString(), new South().getRightDirection().toString());
    }

    @Test
    public void shouldNotReturnWestAsLeftDirectionForSouth() {
        West west = new West();
        assertNotEquals(west.toString(), new South().getLeftDirection().toString());
    }
}