abstract class Direction {
    static final String NORTH = "N";
    static final String EAST = "E";
    static final String WEST = "W";
    static final String SOUTH = "S";

    abstract Direction getLeftDirection();

    abstract Direction getRightDirection();
}
