import java.util.HashMap;
import java.util.Map;

class DirectionTeller {
    private Map<String, Direction> directionMap = new HashMap<>();

    void iniatializeMap() {
        directionMap.put("E", new East());
        directionMap.put("W", new West());
        directionMap.put("N", new North());
        directionMap.put("S", new South());
    }

    Direction getDirection(String direction) {
        return directionMap.get(direction);
    }
}
