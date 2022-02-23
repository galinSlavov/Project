import java.util.Scanner;

public class ProjectGalin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String team = scanner.nextLine();
        String league = scanner.nextLine();

        System.out.println("This player name is " + name +
                ".He play in soccer team " + team +
                " and the team is from league " + league);


        String django = "gosho";
        String anso = "ivan";
        String unzo = "kolyo";

        System.out.println(django + " " + anso + " " + unzo);
    }
}
