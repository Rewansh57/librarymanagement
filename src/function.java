//import java.util.Map;
//import java.util.HashMap;
//import java.util.Scanner;
//
//class EnterBook {
//    Scanner scn = new Scanner(System.in);
//    int bookId;
//    String bookAuthor;
//    String bookName;
//
//    // Method to enter book details
//    public void enterDetails() {
//        System.out.println("Enter the book ID:");
//        bookId = scn.nextInt();
//        scn.nextLine();  // Consume the newline left by nextInt()
//
//        System.out.println("Enter the name of the author:");
//        bookAuthor = scn.nextLine();  // Using nextLine() to capture full author name
//
//        System.out.println("Enter the name of the book:");
//        bookName = scn.nextLine();  // Using nextLine() to capture full book name
//    }
//}
//
//class Head {
//    Scanner scn = new Scanner(System.in);
//    EnterBook ent = new EnterBook();
//    Map<Integer, String[]> books = new HashMap<>();
//
//    // Method to add books to the collection
//    public void addBook() {
//        System.out.println("How many books would you like to add?");
//        int repeat = scn.nextInt();
//        scn.nextLine();  // Consume the newline left by nextInt()
//
//        for (int i = 0; i < repeat; i++) {
//            ent.enterDetails();
//            books.put(ent.bookId, new String[]{ent.bookAuthor, ent.bookName});
//        }
//    }
//
//    // Method to display all books
//    public void displayBooks() {
//        for (Map.Entry<Integer, String[]> entry : books.entrySet()) {
//            int bookId = entry.getKey();
//            String[] bookDetails = entry.getValue();
//            System.out.println("Book ID: " + bookId);
//            System.out.println("Author: " + bookDetails[0]);
//            System.out.println("Book Name: " + bookDetails[1]);
//            System.out.println();
//        }
//    }
//}
//
//public class  {
//    public static void main(String[] args) {
//        Head hd = new Head();
//        hd.addBook();
//        hd.displayBooks();
//    }
//}
