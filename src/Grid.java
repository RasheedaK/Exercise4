class Grid {
    private final int max_x;
    private final int max_y;

    Grid(int max_X, int max_Y) {
        max_x = max_X;
        max_y = max_Y;
    }

    int getYCoordinate() {
        return max_y;
    }

    int getXCoordinate() {
        return max_x;
    }
}
