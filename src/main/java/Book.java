public class Book {

    String title;
    String author;
    String genre;
    boolean isAvailable;
    public Book(String title, String author, String genre, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true; // standard värde
    }

    // ---------------BOOKS---------------------------------------

    //----------------METHODS------------------------------------

    public void lendBook() {
        if(isAvailable) {
            isAvailable = false;
            System.out.println("Book " + title + " has been lent .");
        } else {
            System.out.println("Book " + title + " is already lent.");
        }
    }
    public void returnBook() {
        if(!isAvailable) {
            isAvailable = true;
            System.out.println("Book " + title + " has been returned .");
        } else {
            System.out.println("Book " + title + " is already returned.");
        }
    }

    @Override
    public String toString() {
        return "\nTitle - " + title + "\nAuthor - " + author + "\nGenre - " + genre;
    }

    //----------------------- G & S ----------------------------------------
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}
    public boolean isAvailable() {return isAvailable;}
    public void setAvailable(boolean isAvailable) {this.isAvailable = isAvailable;}
}
