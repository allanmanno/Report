import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String answer;
        String homeName = "", awayName = "";
        int homeScore = 0, awayScore = 0;

        // Asking the user if the would like to make a new report
        Scanner scanner = new Scanner(System.in);

        boolean cont = true;
        while (cont) {
            //

            System.out.println("Would you like to create a report?");
            answer = scanner.next();

            /*
                            homeName = getHomeName(scanner, homeName);
                            awayName = getAwayName(scanner, awayName);
                            homeScore = getHomeScore(scanner, homeScore);
                            awayScore = getAwayScore(scanner, awayScore);
            */

            if (Objects.equals(answer, "yes") || Objects.equals(answer, "Yes") || Objects.equals(answer, "YES"))
                createReport(homeName, awayName, homeScore, awayScore);
            else if (Objects.equals(answer, "no") || Objects.equals(answer, "No") || Objects.equals(answer, "NO")) {
                System.out.println("Report Finished");
                cont = false;
            } else {
                System.out.println("Wrong answer");
            }
        }
    }



/*
    private static String getHomeName(Scanner scanner, String name) {
        System.out.println("Enter home team");
        name = scanner.next();
        return name;
    }

    private static String getAwayName(Scanner scanner, String name) {
        System.out.println("Enter away team");
        name = scanner.next();
        return name;
    }

    private static int getHomeScore(Scanner scanner, int score) {
        System.out.println("Enter Home score");
        score = scanner.nextInt();
        return score;
    }

    private static int getAwayScore(Scanner scanner, int score) {
        System.out.println("Enter Away team");
        score = scanner.nextInt();
        return score;
    }
*/

    private static void createReport(String homeName, String awayName, int homeScore, int awayScore) {
        Report report = new Report();
        report.out();
    }
}
