import java.util.Scanner;

public class Report {
    String homeTeam, awayTeam;
    int homeScore, awayScore;
    Scanner scanner = new Scanner(System.in);

    public String getHomeTeam() {
        System.out.println("Enter home team");
        homeTeam = scanner.next();
        return homeTeam;
    }

    public String getAwayTeam() {
        System.out.println("Enter away team");
        awayTeam = scanner.next();
        return awayTeam;
    }

    public int getHomeScore() {
        System.out.println("Enter home score");
        homeScore = scanner.nextInt();
        return homeScore;
    }

    public int getAwayScore() {
        System.out.println("Enter away score");
        awayScore = scanner.nextInt();
        return awayScore;
    }

    void createReport(){
        getHomeTeam();
        getAwayTeam();
        getHomeScore();
        getAwayScore();
    }
    void out(){
        createReport();
        System.out.println("  home       away " );
        System.out.println(homeTeam + "     " + awayTeam);
        System.out.println("   " + homeScore + "           " + awayScore);
        Card card = new Card(homeTeam, awayTeam);
    }
}
