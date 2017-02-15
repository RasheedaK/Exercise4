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
        if (direction.getDirection() == 'E')
            return position.getRightPosition();
        if (direction.getDirection() == 'W')
            return position.getLeftPosition();
        if (direction.getDirection() == 'N')
            return position.getTopPosition();
        else
            return position.getDownPosition();
    }

    private Direction turnLeft() {
        if (direction.getDirection() == 'E')
            return direction.getNorth();
        if (direction.getDirection() == 'W')
            return direction.getSouth();
        if (direction.getDirection() == 'N')
            return direction.getEast();
        else
            return direction.getWest();
    }

    private Direction turnRight() {
        if (direction.getDirection() == 'E')
            return direction.getSouth();
        if (direction.getDirection() == 'W')
            return direction.getNorth();
        if (direction.getDirection() == 'N')
            return direction.getEast();
        else
            return direction.getWest();
    }
}
