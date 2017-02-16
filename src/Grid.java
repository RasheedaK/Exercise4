class Grid {
    private final int max_x;
    private final int max_y;

    Grid(int max_X, int max_Y) {
        this.max_x = max_X;
        this.max_y = max_Y;
    }

    boolean isValidPosition(Position position) {
        return (position.getXcoordinate() <= this.max_x && position.getYcoordinate() <= this.max_y
                && position.getXcoordinate() >= 0 && position.getYcoordinate() >= 0);
    }
}
