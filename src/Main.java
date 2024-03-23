import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        String answer;
        String homeName = "", awayName = "";
        int homeScore = 0, awayScore = 0;

        // Asking the user if the would like to make a new report
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
            System.out.println("Would you like to create a report? (yes/no)");
            answer = scanner.next();

            if (Objects.equals(answer, "yes") || Objects.equals(answer, "Yes") || Objects.equals(answer, "YES"))
                createReport(homeName, awayName, homeScore, awayScore);
            else if (Objects.equals(answer, "no") || Objects.equals(answer, "No") || Objects.equals(answer, "NO")) {
                System.out.println("Report Finished");

                break;
            }
            else
                System.out.println("Wrong answer");

        }
    }

    private static void createReport(String homeName, String awayName, int homeScore, int awayScore) throws IOException {
        Report report = new Report();
        report.out();
    }
}
