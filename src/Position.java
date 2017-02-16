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

    Position getRightPosition(Position position, Grid grid) {
        Position rightPosition = new Position(this.xCoordinate + 1, this.yCoordinate);
        if (grid.isValidPosition(rightPosition)) {
            return rightPosition;
        }
        return position;
    }

    Position getLeftPosition(Position position, Grid grid) {
        Position leftPosition = new Position(this.xCoordinate - 1, this.yCoordinate);
        if (grid.isValidPosition(leftPosition)) {
            return leftPosition;
        }
        return position;
    }

    Position getTopPosition(Position position, Grid grid) {
        Position topPosition = new Position(this.xCoordinate, this.yCoordinate + 1);
        if (grid.isValidPosition(topPosition)) {
            return topPosition;
        }
        return position;
    }

    Position getDownPosition(Position position,Grid grid) {
        Position downPosition = new Position(this.xCoordinate, this.yCoordinate - 1);
        if (grid.isValidPosition(downPosition)) {
            return downPosition;
        }
        return position;
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
