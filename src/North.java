public class North extends Direction {
    @Override
    Direction getLeftDirection() {
        return new West();
    }

    @Override
    Direction getRightDirection() {
        return new East();
    }

    @Override
    public String toString() {
        return "N";
    }
}
