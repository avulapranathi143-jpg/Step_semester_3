import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    public static void profileWordLengths(String review) {

        String[] words = review.trim().split("\\s+");

        System.out.println("Word Length Profile:");

        for (String word : words) {
            System.out.println(
                    word + " -> " + word.length() + " characters"
            );
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = scanner.nextLine();

        profileWordLengths(review);

        scanner.close();
    }
}