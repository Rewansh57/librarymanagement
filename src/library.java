
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
        System.out.println("Enter the number of books to be entered");


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
        if (books.containsKey(rnum)){
                books.remove(rnum);

            }
            else {
                System.out.println("The number you enter has no matching bookid");}
            System.out.println("After the action taken by the user the reminibg collection:");
            display_book(books);
    }
    public void change_entries(){
        System.out.println("1. Changing the book Id");
        System.out.println("2. Changing the book author");
        System.out.println("3. Changing the bookname");
        System.out.println("Enter choice that you want to make ");
        int enter=scn.nextInt();

        switch(enter){
            case 1:
                System.out.println("Enter the bookid you want to change");
                int oldkey=scn.nextInt();

                if (books.containsKey(oldkey)==true){
                    System.out.println("Enter the bookid you want to add");
                    int newkey=scn.nextInt();
                    String [] values=books.get(oldkey);
                    books.remove(oldkey);
                    books.put(newkey,values);
                    System.out.println("Your request is implemented");
                    display_book(books);
                }
                else{
                    System.out.println("The Id you entered is not present ");
                }
                break;
            case 2 :
                System.out.println("Enter the bookid of the book whose author's name you want to change");
                int index=scn.nextInt();
                if(books.containsKey(index)==true){
                    String [] values=books.get(index);
                    String old_value=values[0];
                    System.out.println("The Author's name that you want");
                    String new_value=scn.nextLine();
                    String [] new_values={new_value,values[1]};
                    books.put(index,new_values);
                    System.out.println("Your request is implemented");
                    display_book(books);
                }
                else{
                    System.out.println("The bookid you gave does not exist");

                }
                break;
            case 3:
                System.out.println("Enter the bookId to change the name ");
                int oldindex=scn.nextInt();
                if(books.containsKey(oldindex)==true){
                    String [] values=books.get(oldindex);
                    System.out.println("Enter the new bookname");
                    String name=scn.nextLine();

                    String [] new_values={values[0],name};
                    books.put(oldindex,new_values);
                    System.out.println("The changes have been implemneted ");
                    display_book(books);
                }
        }






    }
}
public class library {

    public static void main(String[] args) {
        enter_book entb=new enter_book();
        head hd=new head();
        hd.add_book();
        hd.display_book(hd.books);
        hd.remove_book();




    }
}
