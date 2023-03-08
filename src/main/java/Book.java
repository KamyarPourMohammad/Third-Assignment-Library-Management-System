public class Book {
    //Book should contain name,author,year of publish and ISBN
    private String n;
    private String author;
    private String yearOfPublish;
    private String ISBN;
    public Book(String n, String author, String yearOfPublish, String ISBN){
        this.name = n;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;
    }
    //getter methods
    public String getName() {
        return n;
    }
    public String getAuthor() {
        return author;
    }
    public String getYearOfPublish() {
        return yearOfPublish;
    }
    public String getISBN() {
        return ISBN;
    }
    //setter methods
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setName(String n) {
        this.n = n;
    }
    public void setYearOfPublish(String yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}
