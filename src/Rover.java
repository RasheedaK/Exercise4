class Rover {
    private final RoverPosition position;

    Rover(RoverPosition position) {

        this.position = position;
    }

    static RoverPosition getPosition() {
        return new RoverPosition(1, 2);
    }
}
