class Direction {
    private final char direction;
    Direction(char direction){
        this.direction=direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction1 = (Direction) o;

        return direction == direction1.direction;
    }

    @Override
    public int hashCode() {
        return (int) direction;
    }

    Direction getNorth() {
        return new Direction('N');
    }

    Direction getSouth() {
        return new Direction('S');
    }

    Direction getEast() {
        return new Direction('E');
    }

    Direction getWest() {
        return new Direction('W');
    }

    char getDirection() {
        return direction;
    }
}
