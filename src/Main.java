import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        int xCoordinate = Integer.parseInt(strings[0]);
        int yCoordinate = Integer.parseInt(strings[1]);
        String roverDirection = strings[2];
        Position position = new Position(xCoordinate, yCoordinate);
        DirectionTeller directionTeller = new DirectionTeller();
        directionTeller.iniatializeMap();
        Direction direction = directionTeller.getDirection(roverDirection);
        Rover rover = new Rover(position, direction);
        Grid grid = new Grid(5, 5);
        rover.explore("LMLMLMLMM", grid, directionTeller);
        System.out.println(rover.getPosition());
        System.out.println(rover.getDirection());
    }
}
