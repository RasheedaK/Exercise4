import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

public class RoverTest {
    @Test
    public void returnNotEqualsIfPositionIsAt12AndRoverIsAt22() {
        Position roverPosition = new Position(2, 2, 'N');
        Position expectedPosition = new Position(2, 2, 'N');
        Rover rover = new Rover(roverPosition);
        Navigator dummyNavigator=mock(Navigator.class);
        when(dummyNavigator.move(roverPosition,"L")).thenReturn(new Position(2,2,'W'));
        assertNotEquals(expectedPosition,rover.getPosition(dummyNavigator,"L"));
        verify(dummyNavigator,times(1)).move(roverPosition,"L");
    }
    @Test
    public void returnEqualsIfPositionIsAt12AndRoverIsAt12() {
        Position roverPosition = new Position(1, 2, 'W');
        Position expectedPosition = new Position(0, 2, 'W');
        Rover rover = new Rover(roverPosition);
        Navigator dummyNavigator=mock(Navigator.class);
        when(dummyNavigator.move(roverPosition,"M")).thenReturn(new Position(0,2,'W'));
        assertEquals(expectedPosition, rover.getPosition(dummyNavigator,"M"));
        verify(dummyNavigator,times(1)).move(roverPosition,"M");
    }
}