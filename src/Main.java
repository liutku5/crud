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
            System.out.println("1. Enter movie name");
            System.out.println("2. Show movie list");
            System.out.println("3. Edit movie list");
            System.out.println("4. Remove movie from the list");
            System.out.println("5. Close program");
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
                case 3:
                    System.out.println(movielist);
                    String oldMovie = sc.nextLine();
                    if(movielist.contains(oldMovie)){
                        System.out.println("Enter new movies name.");
                        String newMovie = sc.nextLine();
                        int choice = movielist.indexOf(oldMovie);
                        movielist.set(choice, newMovie);
                        System.out.println("The movie " + oldMovie + "was changed to " + newMovie);
                    }else {
                        System.out.println("There is no such movie in the list.");
                    }

                case 4:
                    System.out.println(movielist);
                    System.out.println("Enter movies name you wish to remove.");
                    String movieName = sc.nextLine();
                    if (movielist.contains(movieName)){
                        movielist.remove(movieName);
                    }else {
                        System.out.println("There is no such movie in the list.");
                    }
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Wrongly entered number");
            }
        }

    }
}