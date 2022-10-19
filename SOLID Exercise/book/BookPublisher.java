public class BookToFile implements isBookFile {
    private BookPrinter adaptee;
    
    public BookToFile(BookPrinter adaptee) {
        super();
        this.adaptee = adaptee;
    }
    
    @Override
    public void printToFile() {
        adaptee.printToFile();
    }
}
