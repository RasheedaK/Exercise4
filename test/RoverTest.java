import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

public class RoverTest {
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