import java.util.Objects;
import java.util.Scanner;

public class Card {

    String team, playerName, code, type;
    int playerId, time, number;
    Scanner scanner =new Scanner(System.in);

    void newCard(){
        getPlayerName();
        getPlayerId();
        getNumber();
        getTeam();
        getType();
        getCode();
        getTime();
    }

    private void getPlayerName() {
        System.out.print("Player: ");
        playerName = scanner.nextLine();
    }

    private void getPlayerId() {
        System.out.print("Player ID: ");
        playerId = scanner.nextInt();
        scanner.nextLine();
    }

    private void getNumber(){
        System.out.print("Number: ");
        number = scanner.nextInt();
        scanner.nextLine();
    }

    private void getTeam() {
        System.out.print("Team: ");
        team = scanner.nextLine();
    }

    private void getType() {
        System.out.print("YC/RC: ");
        type = scanner.nextLine();
        while(true){
            if(Objects.equals(type, "YC") || Objects.equals(type, "Yc") || Objects.equals(type, "yc") ||
                    Objects.equals(type, "RC") || Objects.equals(type, "Rc") || Objects.equals(type, "rc")){
                break;
            }
            else {
                System.out.println("wrong input");
                System.out.print("YC/RC: ");
                type = scanner.nextLine();
            }
        }
    }

    private void getCode() {
        System.out.print("Card Code: ");
        code = scanner.nextLine();
    }

    private void getTime() {
        System.out.print("Time: ");
        time = scanner.nextInt();
        scanner.nextLine();
    }

}
