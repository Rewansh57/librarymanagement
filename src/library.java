
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class enter_book{

    Scanner scn=new Scanner(System.in);
    int book_Id;
    String book_author;
    String book_name;


public void enter_details(){

    System.out.println("enter the bookid");
    book_Id=scn.nextInt();



    System.out.println("Enter the name of the author ");
    book_author=scn.next();



    System.out.println("enter the name of the book");
    book_name=scn.next();


}}

class head  {
    Scanner scn=new Scanner(System.in);
    enter_book ent=new enter_book();



    Map<Integer,String[]> books=new HashMap<>();



    public void add_book(){
        books.put(101, new String[]{"Author A", "Book A"});
        books.put(102, new String[]{"Author B", "Book B"});
        books.put(103, new String[]{"Author C", "Book C"});
        books.put(104, new String[]{"Author D", "Book D"});
        books.put(105, new String[]{"Author E", "Book E"});

        int repeat=scn.nextInt();
        for (int i=0;i<repeat;i++){
            ent.enter_details();
            books.put(ent.book_Id,new String[]{ent.book_author,ent.book_name});
        }
    }


    public void display_book(Map<Integer,String[]>  books){
        for (Map.Entry<Integer,String[]> entry : books.entrySet() ){
            int bookid= entry.getKey();
            String [] bookdetails=entry.getValue();
            System.out.println("Book ID: "+bookid+"\nBook Author"+bookdetails[0]+"\nBook Name"+bookdetails[1]);
           System.out.println("-----------------------------\n");
        }


    }
    public void remove_book(){
        System.out.println("Enter the bookid to remove the book");
        int rnum=scn.nextInt();
        for(Map.Entry<Integer,String[]> entry: )

    }
}
public class Main {

    public static void main(String[] args) {
        enter_book entb=new enter_book();
        head hd=new head();
        hd.add_book();
        hd.display_book(hd.books);



    }
}
