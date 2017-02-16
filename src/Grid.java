class Grid {
    private final int max_x;
    private final int max_y;

    Grid(int max_X, int max_Y) {
        this.max_x = max_X;
        this.max_y = max_Y;
    }

    int getMaxYCoordinate() {
        return max_y;
    }

    int getMaxXCoordinate() {
        return max_x;
    }

    boolean isValidPosition(Position position) {
        return true;
    }
}
