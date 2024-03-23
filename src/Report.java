import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Report {
    String homeTeam, awayTeam;
    int homeScore, awayScore;
    String team, playerName, code, type;
    int playerId, time, number;

    Scanner scanner = new Scanner(System.in);
    File file = new File("GameReport.txt");
    FileWriter writer = new FileWriter(file);

    public Report() throws IOException {
    }

    public void getHomeTeam() {
        System.out.println("Enter home team");
        homeTeam = scanner.nextLine();
    }

    public void getAwayTeam() {
        System.out.println("Enter away team");
        awayTeam = scanner.nextLine();
    }

    public void getHomeScore() {
        System.out.println("Enter home score");
        homeScore = scanner.nextInt();
    }

    public void getAwayScore() {
        System.out.println("Enter away score");
        awayScore = scanner.nextInt();
    }

    void out() throws IOException {

        getTeams();
        writer.write("  home       away " );
        writer.write(System.lineSeparator());
        writer.write(this.homeTeam + "     " + this.awayTeam);
        writer.write(System.lineSeparator());
        writer.write("   " + this.homeScore + "           " + this.awayScore);

        getCards();
    }

    void getTeams(){
        getHomeTeam();
        getAwayTeam();
        getHomeScore();
        getAwayScore();
    }

    void getCards() throws IOException {


        while(true){
            System.out.println("Would you like to enter a new misconduct?");
            String answer = scanner.next();
            if (Objects.equals(answer, "yes") || Objects.equals(answer, "Yes") || Objects.equals(answer, "YES")) {
                Card card = new Card();
                card.newCard();

                playerName = card.playerName;
                playerId = card.playerId;
                number = card.number;
                team = card.team;
                type = card.type;
                code = card.code;
                time = card.time;

                writer.write(System.lineSeparator());
                writer.write("-- Player: " + playerName + ", Player Id: " + playerId + ", Number: " + number
                        + ", Team: " + team + ", YC/RC: " + type + ", Code: " + code + ", Time: " + time);

                getCards();
            }
            else if (Objects.equals(answer, "no") || Objects.equals(answer, "No") || Objects.equals(answer, "NO")) {
                break;
            }
            else
                System.out.println("Wrong answer" );
        }
        writer.flush();
        writer.close();
    }
}
