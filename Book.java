public class Book {
    private String BookTitle;
    private String BookAuthor;
    private String BookGenre;
    public String getAuthor(){
        return BookAuthor;
    }
    public void setAuthor(String author){
        this.BookAuthor= author;
    }
    public String getTitle(){
        return BookTitle;
    }
    public void setTitle(String title){
        this.BookTitle = title;
    }
    public String getGenre(){
        return BookGenre;
    }
    public void setGenre(String genre){
        this.BookGenre = genre;
    }
}
