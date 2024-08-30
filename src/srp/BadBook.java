package srp;

public class BadBook {

    private String name;
    private String author;
    private String text;

    public BadBook(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public void printTextToConsole() {
        System.out.println(name + " " + author + " " + text);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

}
