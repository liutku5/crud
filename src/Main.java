import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> movieList;
    public static Scanner sc;
    public static void main(String[] args) {
        movieList = new ArrayList();
        sc = new Scanner(System.in);
        while (true) {
            printInfoMessege();
            int movie = intInput(sc);
            sc.nextLine();
            switch (movie) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    printMovies();
                    break;
                case 3:
                    changeMovie();
                    break;
                case 4:
                    removeMovie();
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

    public static void addMovie() {
        printMovies();
        System.out.println("Enter movie name.");
        String movieInput = sc.nextLine();
        if (!movieList.contains(movieInput)) {
            movieList.add(movieInput);
            System.out.println("The movie " + movieInput + " was added to the list.");
        } else {
            System.out.println("The movie name already exist.");
        }
    }

    public static void printMovies() {
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println((i + 1) + ". " + movieList.get(i));
        }
    }

    public static void changeMovie() {
        printMovies();
        System.out.println("Enter the movie name you wish to change.");
        String oldMovie = sc.nextLine();
        if (movieList.contains(oldMovie)) {
            System.out.println("Enter new movie name.");
            String newMovie = sc.nextLine();
            int choice = movieList.indexOf(oldMovie);
            movieList.set(choice, newMovie);
            System.out.println("The movie " + oldMovie + " was changed to " + newMovie);
        } else {
            System.out.println("There is no such movie in the list.");
        }
    }

    public static void removeMovie() {
        printMovies();
        System.out.println("Enter movies name you wish to remove.");
        String movieName = sc.nextLine();
        if (movieList.contains(movieName)) {
            movieList.remove(movieName);
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