import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] strings=input.split(" ");
        int xCoordinate=Integer.parseInt(strings[0]);
        int yCoordinate=Integer.parseInt(strings[1]);
        char roverDirection=strings[2].charAt(0);
        Position position=new Position(xCoordinate,yCoordinate);
        Direction direction=new Direction(roverDirection);
        Rover rover=new Rover(position,direction);
        rover.explore("LMLMLMLMM");
        System.out.println(rover.getPosition());
        System.out.println(rover.getDirection());
    }
}
