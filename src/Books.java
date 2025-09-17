public class Books {
    private int id;
    private String bookName;
    private String authorName;
    private int numberOfPages;

    public Books(int id, String bookName, String authorName, int numberOfPages){
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberOfPages= numberOfPages;
    }

    public int getId(){
        return id;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getAuthorName (){
        return authorName;
    }
    public void authorName(String authorName){
        this.authorName = authorName;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOdPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Books books = (Books) obj;
        return books.id == id;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }

    @Override
    public String toString(){
        return "Id: " +id+ ", BookName: "+bookName+ ", AuthorName: "+authorName+ ", Number of pages: "+numberOfPages;
    }
}
