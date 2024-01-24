public class MainApp {
    public static void main(String[] args) {
        Book model = retriveBookFromDatabase();

        //creating a view to write book details on console
        BookView view = new BookView();

        BookController controller = new BookController(model,view);

        controller.updateView();
        //updating the model data
        controller.setBookTitle("The kite runner");
        System.out.println("\n Employee details after updating ");

        controller.updateView();



    }
    private static Book retriveBookFromDatabase(){
        Book Book = new Book();
        Book.setTitle("A Thousand Splendid Suns");
        Book.setAuthor("Khaled Hosseini");
        Book.setGenre("Historical Fiction");
        return Book;
    }
}
