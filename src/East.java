public class East extends Direction {
    @Override
    Direction getLeftDirection() {
        return new North();
    }

    @Override
    Direction getRightDirection() {
        return new South();
    }

    @Override
    public String toString() {
        return "E";
    }
}
