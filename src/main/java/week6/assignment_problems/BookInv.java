package week6.assigment_problems;

public class BookInv {

    String title;
    String author;
    int copiesAvailable;

    BookInv(
            String title,
            String author,
            int copiesAvailable) {

        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {

        System.out.println(
                title + " by " +
                        author + " - " +
                        copiesAvailable +
                        " copies available"
        );
    }

    public static void main(String[] args) {

        BookInv[] books = {

                new BookInv(
                        "Clean Code",
                        "Robert C. Martin",
                        3),

                new BookInv(
                        "Effective Java",
                        "Joshua Bloch",
                        5),

                new BookInv(
                        "Refactoring",
                        "Martin Fowler",
                        0),

                new BookInv(
                        "Design Patterns",
                        "GoF",
                        2)
        };

        for (BookInv book : books) {
            book.printEntry();
        }
    }
}