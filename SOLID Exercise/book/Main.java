import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("This", List.of("Want", "To", "Do", "That", "Buh"));
        
        BookPrinter bookPrinter = new BookPrinter(book);

	BookPublisher publisher = new BookPublisher(bookPrinter);
	publisher.printToFile();
		
	BookReader reader = new BookReader(bookPrinter);
	reader.printToScreen();
	}
}