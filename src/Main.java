import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        Grid grid = new Grid(5, 5);
        InputParser inputParser=new InputParser();
        Rover rover=inputParser.parseInput(input);
        rover.explore("LMLMLMLMM", grid, directionTeller);
        System.out.println(rover.getPosition());
        System.out.println(rover.getDirection());
    }
}
