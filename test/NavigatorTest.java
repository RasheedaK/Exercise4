import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NavigatorTest {
    @Test
    public void shouldReturnPositonAs12IfStringIsM() {
        Position position=new Position(1,2);
        Rover rover=new Rover(position);
        Navigator navigator=new Navigator();
        assertEquals(rover.getPosition(),navigator.move(rover.getPosition(),"M"));
    }
}