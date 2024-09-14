//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.Month;
//import java.util.Map;
//import java.util.LinkedHashMap;
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.Arrays;
//
//
//import static java.time.Month.*;
//
//
//
//
//
//class enter_book{
//
//    Scanner scn=new Scanner(System.in);
//    int book_Id;
//    String book_author;
//    String book_name;
//
//
//    public void enter_details(){
//        try{
//
//            System.out.println("enter the bookid");
//            book_Id=scn.nextInt();
//            scn.nextLine();
//            if (book_Id<0){
//                throw new MyExceptions();
//            }
//            System.out.println("Enter the name of the author ");
//            book_author=scn.nextLine();
//
//            System.out.println("enter the name of the book");
//            book_name=scn.nextLine();
//        }
//        catch(MyExceptions mex){
//            mex.Wrong_number();
//        }
//    }}
//class head  {
//    Scanner scn=new Scanner(System.in);
//    enter_book ent=new enter_book();
//    public  void  add_book(Map<Integer, String[]> books){
//        System.out.println("Enter the number of books to be entered");
//        int repeat=scn.nextInt();
//        scn.nextLine();
//        try{
//            if (repeat<0){
//                throw new MyExceptions();
//
//            }
//
//            for (int i=0;i<repeat;i++){
//                ent.enter_details();
//                books.put(ent.book_Id,new String[]{ent.book_author,ent.book_name});
//
//            }
//            System.out.println("The changes are done");
//
//            display_book(books);}
//        catch(MyExceptions mex){
//            mex.Wrong_number();
//        }
//
//
//    }
//
//
//    public void display_book(Map<Integer, String[]> books) {
//        if (books.isEmpty()) {
//            System.out.println("No books available.");
//            return;
//        }
//
//        for (Map.Entry<Integer, String[]> entry : books.entrySet()) {
//            int bookid = entry.getKey();
//            String[] bookdetails = entry.getValue();
//            System.out.println("Book ID: " + bookid);
//            System.out.println("Book Author: " + bookdetails[0]);
//            System.out.println("Book Name: " + bookdetails[1]);
//            System.out.println("-----------------------------");
//        }
//    }
//    public void Display_double(Map<Integer,Double> Sample) {
//        for (Map.Entry<Integer,Double> entry: Sample.entrySet() ){
//            System.out.println("The bookID: +"+entry.getKey());
//            System.out.println("The Fine assigned to this book ID: 0"+entry.getValue());
//            System.out.println("-------------------------------");
//
//
//        }
//
//
//    }
//    public void remove_book(Map<Integer, String[]> books){
//        System.out.println("Enter the bookid to remove the book");
//        int rnum=scn.nextInt();
//        if (books.containsKey(rnum)){
//            books.remove(rnum);
//
//        }
//        else {
//            System.out.println("The number you enter has no matching bookid");}
//        System.out.println("After the action taken by the user the reminibg collection:");
//        display_book(books);
//    }
//    public void change_entries(Map<Integer, String[]> books){
//        System.out.println("1. Changing the book Id");
//        System.out.println("2. Changing the book author");
//        System.out.println("3. Changing the bookname");
//
//        System.out.println("Enter choice that you want to make ");
//        int enter=scn.nextInt();
//        scn.nextLine();
//
//        switch(enter){
//            case 1:
//                System.out.println("Enter the bookid you want to change");
//                int oldkey=scn.nextInt();
//                try{ if (oldkey<0){
//                    throw new MyExceptions();
//
//                }
//
//                    if (books.containsKey(oldkey)==true){
//                        System.out.println("Enter the bookid you want to add");
//                        int newkey=scn.nextInt();
//                        String [] values=books.get(oldkey);
//                        books.remove(oldkey);
//                        books.put(newkey,values);
//                        System.out.println("Your request is implemented");
//                        display_book(books);
//                    }
//                    else{
//                        System.out.println("The Id you entered is not present ");
//                    }}
//                catch (MyExceptions mex){
//                    mex.Wrong_number();
//
//                }
//                break;
//            case 2 :
//                System.out.println("Enter the bookid of the book whose author's name you want to change");
//                int index=scn.nextInt();
//                scn.nextLine();
//                if(books.containsKey(index)==true){
//                    String [] values=books.get(index);
//                    String old_value=values[0];
//                    System.out.println("The Author's name that you want");
//                    String new_value=scn.nextLine();
//                    String [] new_values={new_value,values[1]};
//                    books.put(index,new_values);
//                    System.out.println("Your request is implemented");
//                    display_book(books);
//                }
//                else{
//                    System.out.println("The bookid you gave does not exist");
//
//                }
//                break;
//            case 3:
//                System.out.println("Enter the bookId to change the name ");
//                int oldindex=scn.nextInt();
//                scn.nextLine();
//                if(books.containsKey(oldindex)==true){
//                    String [] values=books.get(oldindex);
//                    System.out.println("Enter the new bookname");
//                    String name=scn.nextLine();
//
//                    String [] new_values={values[0],name};
//                    books.put(oldindex,new_values);
//                    System.out.println("The changes have been implemneted ");
//                    display_book(books);
//                }
//                else{
//                    System.out.println("The bookid you gave does not exist");
//                }
//                break;
//
//
//        }
//
//    }
//    public void sort_byID(Map<Integer, String[]> books){
//        int [] values= new int [books.size()];
//        int i=0;
//        Map<Integer,String[]> sorted_books=new LinkedHashMap<>();
//
//        for(Map.Entry<Integer,String[]>entry: books.entrySet()){
//            values[i]=entry.getKey();
//            i++;
//        }
//        System.out.println("Before sorting");
//        for (int  value:values){
//            System.out.println(value+" ");
//        }
//
//
//        sorting(values);
//
//
//        System.out.println("\nAftersorting");
//
//        for (int  value:values){
//            System.out.println(value+" ");
//        }
//
//
//        for (int l =0;l<values.length;l++){
//            sorted_books.put(values[l],books.get(values[l]));
//
//        }
//        System.out.println("Here is you sorted books:------------------- "+"\n");
//        display_book(sorted_books);
//    }
//
//    public void sorting( int array[]){
//
//        int mainlen=array.length;
//        int [] leftside=new int[mainlen/2];
//        int [] rightside =new int[mainlen-leftside.length];
//        if (array.length<2){
//            return;
//        }
//        for (int i=0;i<mainlen;i++){
//            if (i<leftside.length){
//                leftside[i]=array[i];
//            }
//            else{
//                rightside[i- leftside.length]=array[i];
//
//            }
//        }
//        sorting(leftside);
//        sorting(rightside);
//        merging(array,leftside,rightside);
//    }
//    public void merging(int [] array,int[] leftarray,int[] rightarray){
//
//        int i=0,j=0,k=0;
//        while(i< leftarray.length&&j<rightarray.length){
//            if (leftarray[i]<=rightarray[j]){
//                array[k]=leftarray[i];
//                i++;
//            }
//            else{
//                array[k]=rightarray[j];
//                j++;
//
//            }
//            k++;
//        }
//        while(i<leftarray.length){
//            array[k]=leftarray[i];
//            i++;
//            k++;
//        }
//        while(j< rightarray.length){
//            array[k]= rightarray[j];
//            j++;
//            k++;
//        }
//    }
//
//}
//class employee extends head {
//    public void fine_map(Map<Integer ,Double> Fine,Map <Integer,String []> books){
//        for (Map.Entry<Integer,String []>entry : books.entrySet()){
//            System.out.println("Enter the amt for book with book id: "+entry.getKey());
//            double amt=scn.nextDouble();
//            Fine.put(entry.getKey(),amt);
//        }
//        Display_double(Fine);
//    }
//    public void fine_each(Map<Integer,String[]> books,Map<Integer,Double> Fine){
//        System.out.println("Enter the number of books for which the fine has to be entered ");
//        int num=scn.nextInt();
//        for (int i=0;i<num;i++){
//            System.out.println("Enter th bookId: "+i);
//            int keyindex=scn.nextInt();
//            for (Map.Entry<Integer,String []> entry : books.entrySet()){
//                if (entry.getKey()==keyindex){
//                    System.out.println("Enter the fine you want to add");
//                    double amt=scn.nextDouble();
//                    Fine.put(keyindex,amt);
//
//                }
//            }
//            Display_double(Fine);
//        }
//    }
//
//}
//public class studentclass {
//
//    public void main(String[] args) {
//        Map<Integer,String[]> books=new HashMap<>();
//        Map<Integer,String> studentinfo=new LinkedHashMap<>();
//        Map<Integer,Double> karza=new LinkedHashMap<>();
//        Map <Integer,LocalDate[]> store=new LinkedHashMap<>();
//
//
//
//        books.put(102, new String[]{"Author B", "Book B"});
//        books.put(103, new String[]{"Author C", "Book C"});
//        books.put(104, new String[]{"Author D", "Book D"});
//        books.put(105, new String[]{"Author E", "Book E"});
//        books.put(101, new String[]{"Author A", "Book A"});
//
//        enter_book entb=new enter_book();
//        head hd=new head();
//        student std=new student();
//        employee emp=new employee();
//
//
//        Scanner scn=new Scanner(System.in);
//        while(true){
//            System.out.println("Enter your choice For ex 1 2 3 4.......... ");
//        System.out.println("1.Head");
//        System.out.println("2. Student");
//        System.out.println("3. Employee");
//        int choice=scn.nextInt();
//        scn.nextLine();
//        try{ if (choice<0){
//            throw new MyExceptions();
//        }
//            switch(choice){
//                case 1:
//                    System.out.println("Enter the operation youw ant to do: ");
//                    System.out.println("1.Add books ");
//                    System.out.println("2.Remove books");
//                    System.out.println("3.Change details of books");
//                    System.out.println("4.Sorting by bookID");
//                    int select1=scn.nextInt();
//                    scn.nextLine();
//                    switch (select1){
//                        case 1:
//                            hd.add_book(books);
//
//                            break;
//
//                        case 2:
//                            hd.remove_book(books);
//                            break;
//
//
//                        case 3:
//                            hd.change_entries(books);
//                            break;
//                        case 4:
//                            hd.sort_byID(books);
//                            break;
//
//
//                    }
//                    break;
//                case 2:
//
//                    System.out.println("Enter you choice:  ");
//                    System.out.println("1.Fetch A book's info");
//                    System.out.println("2. Issue a book: ");
//                    System.out.println("3. Sort by Book id");
//                    System.out.println("4.Return book");
//
//
//                    int num=scn.nextInt();
//                    scn.nextLine();
//                    switch(num) {
//                        case 1:
//                            std.fetch_books(books);
//                            break;
//                        case 2:
//                            std.issue_book(books,studentinfo,store);
//                            break;
//
//
//                        case 3:
//                            std.sort_byID(books);
//                            break;
//                        case 4:
//                            std.return_book(store);
//                            break;
//                    }
//
//                case 3 :
//                    System.out.println("Enter your choice");
//                    System.out.println("1.Enter fine for all books");
//                    System.out.println("2.Enter fine for a particular books");
//                    int enter=scn.nextInt();
//                    switch(enter){
//                        case 1:
//                            emp.fine_map(karza,books);
//                            break;
//                        case 2:
//                            emp.fine_each(books,karza);
//                            break;
//                    }
//            }}
//
//        catch(MyExceptions mex){
//            mex.Wrong_number();
//
//        }
//
//    }
//}
//
//class student extends head{
//    private LocalDate return_date;
//    public void fetch_books(Map<Integer, String[]> books){
//        System.out.println("enter your choice ");
//
//        System.out.println("1.Search book by bookID");
//        System.out.println("2.Search book by author name");
//        System.out.println("3.Search book by book name");
//
//        int choice =scn.nextInt();
//        scn.nextLine();
//        try{
//            if(choice<0){
//                throw new MyExceptions();
//            }
//            switch(choice){
//                case 1 :
//                    System.out.println("Enter the book id you want to fetch ");
//                    int index=scn.nextInt();
//                    scn.nextLine();
//                    if (books.containsKey(index)==true){
//                        books.get(index);
//
//                    }
//                    else {
//                        System.out.println("Invalid book id ");
//
//                    }
//                    break;
//                case 2 :
//                    System.out.println("Enter the author name of the book you want to fetch ");
//                    String author_name=scn.nextLine();
//                    String [] values=new String[books.size()];
//                    int keyindex = -1;
//
//
//
//                    for (Map.Entry<Integer,String[]>entry: books.entrySet()){
//                        values= entry.getValue();
//                        if (values[0].equals(author_name)){
//                            keyindex= entry.getKey();
//                            break;
//                        }
//                        else{
//                            continue;
//                        }
//                    }
//                    if (keyindex!=-1){
//                        System.out.println("We found the book reuqested and the details are"+ Arrays.toString(books.get(keyindex)));
//                    }
//                    else{
//                        System.out.println("No such book was found");
//                    }
//                    break;
//                case 3:
//                    System.out.println("Enter the name of the book you want ");
//                    String name=scn.nextLine();
//                    int keyindex2=-1;
//                    String [] values2=new String[books.size()];
//                    for (Map.Entry<Integer,String[]>entry:books.entrySet()){
//                        values2= entry.getValue();
//                        if(values2[1].equals(name)){
//                            keyindex2=entry.getKey();
//                            break;
//
//                        }
//                        else{
//                            continue;
//                        }
//
//                    }
//                    if (keyindex2!=-1){
//                        System.out.println("The books you searched fopr is :"+ Arrays.toString(books.get(keyindex2)));
//
//                    }
//                    else{
//                        System.out.println("The bookbname you entered does not exist");
//
//                    }
//
//            }}
//
//
//
//
//
//
//        catch(MyExceptions mex){
//            mex.Wrong_number();
//
//        }}
//    public void issue_book(Map<Integer, String[]> books,Map<Integer,String> studentinfo,Map<Integer,LocalDate[]> store){
//        System.out.println("Enter the no of books to be issued");
//        int n=scn.nextInt();
//        scn.nextLine();
//        try{
//            if (n<0){
//                throw new MyExceptions();
//            }
//
//            int mainlen=books.size();
//
//            HashMap<Integer,String[]> collection=new HashMap<>();
//            for (int i=0;i<n;i++){System.out.println("Enter the book id you want to issue ");
//                int index=scn.nextInt();
//
//
//                if (books.containsKey(index)==true){
//                    String [] values=books.get(index);
//                    books.get(index);
//                    books.remove(index);
//                    collection.put(index,values);
//                    LocalDate issue_date=LocalDate.now();
//                    System.out.println("The date of issue: "+ issue_date);
//                    LocalDate return_date=issue_date.plusDays(30);
//                    store.put(index,new LocalDate[]{issue_date,return_date});
//                }
//                else{
//                    System.out.println("The book id "+i+" you mentioned is invalid");
//                }
//
//
//            }
//            System.out.println("The remaining books");
//
//            display_book(books);
//            System.out.println(" The selected books");
//            display_book(collection);
//
//            System.out.println("The maximum return date is : "+ return_date);
//            if(books.size()==mainlen){
//                System.out.println("You have not issued a book");
//
//            }
//            else{
//                System.out.println("You issued the following no of books: "+n);
//                System.out.println("Enter you personal details as follows: 1. Registor number 2. Your name");
//                int regisno=scn.nextInt();
//                scn.nextLine();
//                String name=scn.nextLine();
//
//                studentinfo.put(regisno,name);
//
//            }}
//        catch(MyExceptions mex){
//            mex.Wrong_number();
//        }
//    }
//    public void return_book(Map<Integer,LocalDate[]> datemap){
//        System.out.println("Enter the bookID ");
//        int bookid=scn.nextInt();
//        if( datemap.containsKey(bookid))
//        {
//            LocalDate[] date=datemap.get(bookid);
//            LocalDate due_date=date[1];
//            LocalDate return_date=LocalDate.now();
//            if (return_date.isAfter(due_date)){
//                long daysOverdue = java.time.temporal.ChronoUnit.DAYS.between(due_date, return_date);
//                System.out.println("You Overdue the following number of days: "+daysOverdue);
//                double fine=10*daysOverdue;
//                System.out.println("The following amount is the total fine that you have to pay: "+fine);
//            }
//            else{
//                System.out.println("The book is successfullt returned and no fine is given");
//            }
//        }
//        else{
//            System.out.println("the bookID you provided is not present");
//        }
//
//
//    }
//
//}}
