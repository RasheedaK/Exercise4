import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] strings=input.split(" ");
        int xCoordinate=Integer.parseInt(strings[0]);
        int yCoordinate=Integer.parseInt(strings[1]);
        char dir=strings[2].charAt(0);
        Position position=new Position(xCoordinate,yCoordinate,dir);
    }
}
