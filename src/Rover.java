class Rover {
    private Position position;
    private Direction direction;
    Rover(Position position,Direction direction) {
        this.position = position;
        this.direction=direction;
    }

    String getPosition() {
        return position.toString();
    }
    char getDirection() {
        return direction.getDirection();
    }

    void explore(String instruction) {
        for (int i = 0; i < instruction.length(); i++) {
            if (instruction.charAt(i) == 'L')
                direction = turnLeft();
            else if (instruction.charAt(i) == 'R')
                direction = turnRight();
            else
                position = moveForward();
        }
    }

    private Position moveForward() {
        if (direction.getDirection() == Direction.EAST)
            return position.getRightPosition();
        if (direction.getDirection() == Direction.WEST)
            return position.getLeftPosition();
        if (direction.getDirection() == Direction.NORTH)
            return position.getTopPosition();
        else
            return position.getDownPosition();
    }

    private Direction turnLeft() {
        if (direction.getDirection() == Direction.EAST)
            return direction.getNorth();
        if (direction.getDirection() == Direction.WEST)
            return direction.getSouth();
        if (direction.getDirection() == Direction.NORTH)
            return direction.getWest();
        else
            return direction.getEast();
    }

    private Direction turnRight() {
        if (direction.getDirection() == Direction.EAST)
            return direction.getSouth();
        if (direction.getDirection() == Direction.WEST)
            return direction.getNorth();
        if (direction.getDirection() == Direction.NORTH)
            return direction.getEast();
        else
            return direction.getWest();
    }
}
