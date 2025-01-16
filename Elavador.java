import java.util.Scanner;
public class Elavador {
    public static void main(String[] args) {
        final int FLOOR_TEMPLATE[] = {0,0,0,0,0,0,0,0,0,0}; 
        int FLOORS [] = {0,0,0,0,0,0,0,0,0,0}; 

        int destiny = 0;
        int currentFloor = 0;
        FLOORS[currentFloor]=1;
        int userDestiny = 0;        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the floor: ");
        userDestiny = scanner.nextInt();
        destiny = userDestiny;
        String elevator = "]";
        
        printing(currentFloor,destiny,FLOORS,FLOOR_TEMPLATE);
        
                            
                        }
                    
                        static void printing(int currentFloor, int destiny, int[] FLOORS, int[] FLOOR_TEMPLATE) {
                while (currentFloor <= destiny) {
                    int elevatorPrint=(FLOORS.length-1);
                    while(elevatorPrint>=0){
                        System.out.println(parse(FLOORS[elevatorPrint],destiny));
                                    elevatorPrint=elevatorPrint-1;} 
                currentFloor=currentFloor+1;
                FLOORS=FLOOR_TEMPLATE;
                FLOORS[currentFloor]=1;
                System.out.println();
                }            }
        
                        static String parse(int change, int destiny){
                    return switch (change) {
                        case 0 -> "|   |";
                        case 1 -> "|^"+ destiny +"^|";
                        default -> "???";
                };
            }
        }
        