import java.awt.event.ItemEvent;
import java.util.Scanner;

public class ProjectGalin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int y = 2;
        int x = 3;

        int total = i + y + x;
        System.out.println("The result is " + total);

        String name = scanner.nextLine();
        String team = scanner.nextLine();
        String league = scanner.nextLine();

        System.out.println("This player name is " + name +
                ".He play in soccer team " + team +
                " and the team is from league " +league );
    }
}
