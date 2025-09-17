import java.awt.print.Book;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static{
        System.out.println("==================Welcome User===================");
    }

    public static int read(Scanner in, String promt){
       while(true) {
            try {
                  System.out.println(promt);
                  return  in.nextInt();
                  //return choice;
            } catch (InputMismatchException e) {
                System.out.println("please enter a Valid choice (0-4)");
                in.nextLine();
            }
       }
    }

    public static int id(Scanner in, String prompt){
        System.out.println(prompt);
        int id = in.nextInt();
        in.nextLine();
        return id;
    }

    public static void main(String[] args) {
        BookService bookService = new BookService();
        Scanner in = new Scanner(System.in);
        System.out.println();
        int choice;
        do{
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. View Book by Id");
            System.out.println("4. List All Books");
            System.out.println("0. Exit..");
            choice = read(in, "Enter Choice: ");

            switch(choice){
                case 1->{
                    if(bookService.booksSet.isEmpty()) {

                    }

                    int id = id(in,"Enter Id: ");
                    if(!bookService.booksSet.isEmpty()){
                        while(bookService.getBook(id)){
                            System.out.println("Book with this id already exist");
                        }
                    }


                    System.out.println("Enter Book Name: ");
                    String bookName = in.nextLine();
                    System.out.println("Enter Author Name: ");
                    String authorName = in.nextLine();
                    System.out.println("Enter Number Of Pages It has: ");
                    int numberOfPages = in.nextInt();
                    in.nextLine();
                    boolean added = bookService.addBook(new Books(id,bookName,authorName,numberOfPages));
                    System.out.println(added? "Book Added Successfully->":"Book with same id already exist.");


                }
                case 2->{
                    System.out.println("Enter Id to delete a book: ");
                    int id = in.nextInt();
                    in.nextLine();
                    boolean deleted = bookService.removeBook(id);
                    System.out.println(deleted? "Book deleted->": "No book found");

                }
                case 3->{
                    System.out.println("Enter Id: ");
                    int id = in.nextInt();
                    in.nextLine();
                    Books book = bookService.getBookId(id);
                    System.out.println(book != null? book: "Not found!!!");
                }
                case 4-> bookService.listAllBooks();
                case 0-> System.out.println("============Exiting===========");
            }

        }while(choice != 0);

    }
}