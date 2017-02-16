import org.junit.Test;

import static org.junit.Assert.*;

public class InputParserTest {
    @Test
    public void shouldReturnRoverWhichIsAt12NIfString12N() {
        String instruction="1 2 N";
        InputParser inputParser=new InputParser();
        Rover expectedRover=inputParser.parseInput(instruction);
        String expectedPosition="1 2";
        String expectedDirection="N";
        assertEquals(expectedPosition,expectedRover.getPosition());
        assertEquals(expectedDirection,expectedRover.getDirection());
    }
    @Test
    public void shouldNotReturnRoverWhichIsAt12NIfString13E() {
        String instruction="1 3 E";
        InputParser inputParser=new InputParser();
        Rover expectedRover=inputParser.parseInput(instruction);
        String expectedPosition="1 2";
        String expectedDirection="N";
        assertNotEquals(expectedPosition,expectedRover.getPosition());
        assertNotEquals(expectedDirection,expectedRover.getDirection());
    }
}