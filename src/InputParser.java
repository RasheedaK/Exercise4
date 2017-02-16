class InputParser {

    Rover parseInput(String input) {
            String[] strings = input.split(" ");
            int xCoordinate = Integer.parseInt(strings[0]);
            int yCoordinate = Integer.parseInt(strings[1]);
            String roverDirection = strings[2];
            Position position = new Position(xCoordinate, yCoordinate);
            DirectionTeller directionTeller = new DirectionTeller();
            directionTeller.iniatializeMap();
            Direction direction = directionTeller.getDirection(roverDirection);
            Rover rover = new Rover(position, direction);
            return rover;
    }
}
