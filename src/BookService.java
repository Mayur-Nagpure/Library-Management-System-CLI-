import java.util.*;

public class BookService {
    public Set<Books> booksSet;

    public BookService() {
        booksSet = new HashSet<>();
    }

    public boolean addBook(Books books){
        return booksSet.add(books);
    }

    public Books getBookId(int id){
        for(Books b: booksSet){
            if(b.getId() == id) return b;
        }
        return null;
    }

    public boolean getBook(int id){
            for(Books b: booksSet){
                if(b.getId() == id) return true;
            }
            return false;
    }

    public boolean removeBook(int id){
        Books b = getBookId(id);
        return booksSet.remove(b);
    }

    public boolean updateBook(int id, String bookName, String authorName, int numberOfPages ){
        Books book = getBookId(id);
        if(book != null){
            booksSet.remove(book);
            booksSet.add(new Books( id, bookName, authorName, numberOfPages));
            return true;
        }
        return false;
    }

    public void listAllBooks(){
        if(booksSet.isEmpty()){
            System.out.println("Student Not Found!!!");
        }else{
            for(Books b : booksSet){
                System.out.println(b);
            }
        }
    }
}
