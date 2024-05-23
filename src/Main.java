import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> movielist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            printInfoMessege();
            int movie = intInput(sc);
            sc.nextLine();
            switch (movie) {
                case 1:
                    addMovie(movielist, sc);
                    break;
                case 2:
                    printMovies(movielist);
                    break;
                case 3:
                    changeMovie(movielist, sc);
                    break;
                case 4:
                    removeMovie(movielist, sc);
                    break;
                case 5:
                    System.exit(1);
            }
        }

    }

    public static void printInfoMessege() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("1. Enter movie name");
        System.out.println("2. Show movie list");
        System.out.println("3. Edit movie list");
        System.out.println("4. Remove movie from the list");
        System.out.println("5. Close program");
        System.out.println("--------------------------");
        System.out.println();
    }

    public static void addMovie(ArrayList<String> movielist, Scanner sc) {
        printMovies(movielist);
        System.out.println("Enter movie name.");
        String movieInput = sc.nextLine();
        if (!movielist.contains(movieInput)) {
            movielist.add(movieInput);
            System.out.println("The movie " + movieInput + " was added to the list.");
        } else {
            System.out.println("The movie name already exist.");
        }
    }

    public static void printMovies(ArrayList<String> movielist) {
        for (int i = 0; i < movielist.size(); i++) {
            System.out.println((i + 1) + ". " + movielist.get(i));
        }
    }

    public static void changeMovie(ArrayList<String> movielist, Scanner sc) {
        printMovies(movielist);
        System.out.println("Enter the movie name you wish to change.");
        String oldMovie = sc.nextLine();
        if (movielist.contains(oldMovie)) {
            System.out.println("Enter new movie name.");
            String newMovie = sc.nextLine();
            int choice = movielist.indexOf(oldMovie);
            movielist.set(choice, newMovie);
            System.out.println("The movie " + oldMovie + " was changed to " + newMovie);
        } else {
            System.out.println("There is no such movie in the list.");
        }
    }

    public static void removeMovie(ArrayList<String> movielist, Scanner sc) {
        printMovies(movielist);
        System.out.println("Enter movies name you wish to remove.");
        String movieName = sc.nextLine();
        if (movielist.contains(movieName)) {
            movielist.remove(movieName);
            System.out.println("The movie " + movieName + " was removed from the list.");
        } else {
            System.out.println("There is no such movie in the list.");
        }
    }

    public static int intInput(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Plese enter a digit");
                sc.nextLine();
            }
        }
    }
}