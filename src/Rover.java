class Rover {
    private Position position;
    private Direction direction;

    Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    String getPosition() {
        return position.toString();
    }

    String getDirection() {
        return direction.toString();
    }

    void explore(String instruction, Grid grid, DirectionTeller directionTeller) {
        for (int i = 0; i < instruction.length(); i++) {
            if (instruction.charAt(i) == 'L')
                direction = turnLeft(directionTeller);
            else if (instruction.charAt(i) == 'R')
                direction = turnRight(directionTeller);
            else
                position = moveForward(grid);
        }
    }

    private Position moveForward(Grid grid) {
        if (direction.toString().equals(Direction.EAST))
            return position.getRightPosition(grid);
        if (direction.toString().equals(Direction.WEST))
            return position.getLeftPosition(grid);
        if (direction.toString().equals(Direction.NORTH))
            return position.getTopPosition(grid);
        else
            return position.getDownPosition(grid);
    }

    private Direction turnLeft(DirectionTeller directionTeller) {
        return directionTeller.getDirection(direction.toString()).getLeftDirection();

    }

    private Direction turnRight(DirectionTeller directionTeller) {
        return directionTeller.getDirection(direction.toString()).getRightDirection();
    }
}
