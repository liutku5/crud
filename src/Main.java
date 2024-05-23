import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> movielist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        movielist.add("The Matrix");
        movielist.add("Gladiator");
        movielist.add("Assassin's Creed");
        movielist.add("X-Men: Days of Future Past");
        while (true){
            System.out.println();
            System.out.println("--------------------------");
            System.out.println("1. enter movie name");
            System.out.println("2. show movie list");
            System.out.println("3. edit movie list");
            System.out.println("4. remove movie from the list");
            System.out.println("5. close program");
            System.out.println("--------------------------");
            System.out.println();
            int movie = sc.nextInt();
            sc.nextLine();
            switch (movie){
                case 1:
                    System.out.println("Enter movie name.");
                    String input = sc.nextLine();
                    movielist.add(input);
                    break;
                case 2:
                    for (int i = 0; i < movielist.size(); i++) {
                        System.out.println(movielist.get(i));
                    }
                    break;
                case 4:
//                    System.out.println("Enter movies name you wish to remove.");
//                    String input = sc.nextLine();
//                    movielist.remove();
//                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Wrongly entered number");




            }
        }

    }
}