class Position {
    private final int xCoordinate;
    private final int yCoordinate;

    Position(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        return xCoordinate == position.xCoordinate && yCoordinate == position.yCoordinate;
    }

    @Override
    public int hashCode() {
        int result = xCoordinate;
        result = 31 * result + yCoordinate;
        return result;
    }

    Position getRightPosition() {
        return new Position(this.xCoordinate + 1, this.yCoordinate);
    }

    Position getLeftPosition() {
        return new Position(this.xCoordinate - 1, this.yCoordinate);
    }

    Position getTopPosition() {
        return new Position(this.xCoordinate, this.yCoordinate + 1);
    }

    Position getDownPosition() {
        return new Position(this.xCoordinate, this.yCoordinate - 1);
    }

    @Override
    public String toString() {
        return xCoordinate + " " + yCoordinate;
    }

    int getXcoordinate() {
        return xCoordinate;
    }

    int getYcoordinate() {
        return yCoordinate;
    }
}
