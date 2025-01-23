import java.util.Arrays;
import java.util.Scanner;
public class elevator {
    public static void main(String[] args) {
        int FLOORS [] = {0,0,0,0,0,0,0,0,0,0}; 

        int currentFloor = 0;
        FLOORS[currentFloor]=1;
        int destiny;
        int userDestiny=0;
        String direction="-";        
        
        destiny=askFloor(userDestiny);
        printing(currentFloor,destiny,FLOORS,direction,userDestiny);
        checker(currentFloor,destiny,FLOORS,direction,userDestiny);

    
    }
                    
    static void printing(int currentFloor, int destiny, int[] FLOORS,String direction,int userDestiny) {
        while (currentFloor != destiny) {
            int elevatorPrint=(FLOORS.length-1);
                while(elevatorPrint>=0){
                    direction=directionMaking(currentFloor,destiny);
                    System.out.println(elevatorPrint+"-> "+parse(FLOORS[elevatorPrint],destiny,direction));
                    elevatorPrint=elevatorPrint-1;} 
            if(currentFloor<destiny){
                currentFloor=currentFloor+1;
                Scanner scanLine=new Scanner(System.in);
                scanLine.nextLine();
            }
            if(currentFloor>destiny){
                currentFloor=currentFloor-1;
                Scanner scanLine=new Scanner(System.in);
                scanLine.nextLine();
            }
            Arrays.fill(FLOORS,0);
            FLOORS[currentFloor]=1;
            System.out.println();
        }
        if(currentFloor==destiny){
            int elevatorPrint=(FLOORS.length-1);
                while(elevatorPrint>=0){
                    direction=directionMaking(currentFloor,destiny);
                    System.out.println(elevatorPrint+"-> "+parse(FLOORS[elevatorPrint],destiny,direction));
                    elevatorPrint=elevatorPrint-1;

                }
        System.out.println("Arrived to destiny!");            
        }
        destiny=askFloor(userDestiny);
        checker(currentFloor, destiny, FLOORS, direction, userDestiny);
    }
    static String parse(int change, int destiny, String direction){
        return switch (change) {
            case 0 -> "|   |";
            case 1 -> "|"+direction+ destiny +direction+"|";
            default -> "???";
        };}

    static String directionMaking(int currentFloor, int destiny) {
        if(currentFloor<destiny){
            return "^";}
        if(currentFloor>destiny){
            return "v";}
        //if(currentFloor==destiny){
        else{
            return "-";}}

    static int askFloor(int userDestiny) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the floor: ");
        userDestiny = scanner.nextInt();
        return userDestiny;
    }

    static void checker(int currentFloor, int destiny, int[] FLOORS, String direction, int userDestiny) {
        if(destiny!=currentFloor){
            printing(currentFloor,destiny,FLOORS,direction,userDestiny);
        }else{
            System.out.println("we already here bruh");
        }
    }
}
        