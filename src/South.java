public class South extends Direction {
    @Override
    Direction getLeftDirection() {
        return new East();
    }

    @Override
    Direction getRightDirection() {
        return new West();
    }

    @Override
    public String toString() {
        return "S";
    }
}
