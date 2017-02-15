class Position {
    private final int xCoordinate;
    private final int yCoordinate;
    private final char direction;

    Position(int xCoordinate, int yCoordinate, char direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (xCoordinate != position.xCoordinate) return false;
        return yCoordinate == position.yCoordinate && direction == position.direction;
    }

    @Override
    public int hashCode() {
        int result = xCoordinate;
        result = 31 * result + yCoordinate;
        result = 31 * result + (int) direction;
        return result;
    }

    char getDirection() {
        return direction;
    }

    int getXcoordinate() {
        return xCoordinate;
    }

    int getYcoordinate() {
        return yCoordinate;
    }

    Position getRightPosition() {
        return new Position(this.xCoordinate + 1, this.yCoordinate, this.getDirection());
    }

    Position getLeftPosition() {
        return new Position(this.xCoordinate - 1, this.yCoordinate, this.getDirection());
    }

    Position getTopPosition() {
        return new Position(this.xCoordinate , this.yCoordinate + 1, this.getDirection());
    }

    Position getDownPosition() {
        return new Position(this.xCoordinate, this.yCoordinate - 1, this.getDirection());
    }

    @Override
    public String toString() {
        return xCoordinate+" "+yCoordinate+" "+direction ;
    }
}
