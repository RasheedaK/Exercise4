public class West extends Direction {
    @Override
    Direction getLeftDirection() {
        return new South();
    }

    @Override
    Direction getRightDirection() {
        return new North();
    }

    @Override
    public String toString() {
        return "W";
    }
}
