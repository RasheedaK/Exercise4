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

    Position getRightPosition(Grid grid) {
        Position rightPosition = new Position(this.xCoordinate + 1, this.yCoordinate);
        if (grid.isValidPosition(rightPosition)) {
            return rightPosition;
        }
        return this;
    }

    Position getLeftPosition(Grid grid) {
        Position leftPosition = new Position(this.xCoordinate - 1, this.yCoordinate);
        if (grid.isValidPosition(leftPosition)) {
            return leftPosition;
        }
        return this;
    }

    Position getTopPosition(Grid grid) {
        Position topPosition = new Position(this.xCoordinate, this.yCoordinate + 1);
        if (grid.isValidPosition(topPosition)) {
            return topPosition;
        }
        return this;
    }

    Position getDownPosition(Grid grid) {
        Position downPosition = new Position(this.xCoordinate, this.yCoordinate - 1);
        if (grid.isValidPosition(downPosition)) {
            return downPosition;
        }
        return this;
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
