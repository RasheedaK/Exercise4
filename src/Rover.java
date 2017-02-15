import java.util.Dictionary;

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

    void explore(String instruction) {
        for (int i = 0; i < instruction.length(); i++) {
            if (instruction.charAt(i) == 'L')
                position = turnLeft();
            else if (instruction.charAt(i) == 'R')
                position = turnRight();
            else
                position = moveForward();
        }
    }

    private Position moveForward() {
        if (position.getDirection() == 'E')
            return position.getRightPosition();
        if (position.getDirection() == 'W')
            return position.getLeftPosition();
        if (position.getDirection() == 'N')
            return position.getTopPosition();
        else
            return position.getDownPosition();
    }

    private Position turnLeft() {
        if (position.getDirection() == 'E')
            return new Position(position.getXcoordinate(), position.getYcoordinate(), 'N');
        if (position.getDirection() == 'W')
            return new Position(position.getXcoordinate(), position.getYcoordinate(), 'S');
        if (position.getDirection() == 'N')
            return new Position(position.getXcoordinate(), position.getYcoordinate(), 'W');
        else
            return new Position(position.getXcoordinate(), position.getYcoordinate(), 'E');
    }

    private Position turnRight() {
        if (position.getDirection() == 'E')
            return new Position(position.getXcoordinate(), position.getYcoordinate(), 'S');
        if (position.getDirection() == 'W')
            return new Position(position.getXcoordinate(), position.getYcoordinate(), 'N');
        if (position.getDirection() == 'N')
            return new Position(position.getXcoordinate(), position.getYcoordinate(), 'E');
        else
            return new Position(position.getXcoordinate(), position.getYcoordinate(), 'W');
    }
}
