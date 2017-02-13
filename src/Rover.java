class Rover {
    private final Position position;

    Rover(Position position) {

        this.position = position;
    }

    Position getPosition(Navigator navigator, String instruction) {
        return navigator.move(position, instruction);
    }
}
