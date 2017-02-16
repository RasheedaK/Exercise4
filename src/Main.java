public class Main {
    public static void main(String args[]) {
        InputConsole inputConsole = new InputConsole();
        System.out.println("Enter Rover Position");
        String input = inputConsole.takeInput();
        System.out.println("Enter Instruction");
        String instruction=inputConsole.takeInput();
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        Grid grid = new Grid(5, 5);
        try {
            InputParser inputParser = new InputParser();
            Rover rover = inputParser.parseInput(input);
            rover.explore(instruction, grid, directionTeller);
            System.out.println(rover.getPosition());
            System.out.println(rover.getDirection());
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
