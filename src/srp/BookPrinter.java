package srp;

public class BookPrinter {

    void printTextToConsole() {
        Book book = new Book("책 이름", "저자", "책 내용");
        System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getText());
    }
}
