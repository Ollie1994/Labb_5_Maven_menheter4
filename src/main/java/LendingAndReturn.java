import java.util.HashMap;

public class LendingAndReturn {
    HashMap<String, Book> books = new HashMap<String, Book>();
    public void addBooks() {
        books.put("1", new Book("The Green Mile", "Steven King", "Thriller", true));
        books.put("2", new Book("Sömngångaren", "Lars Keppler", "Crime", true));
        books.put("3", new Book("Lokattens Klor", "Karin Smirnoff", "Thriller", true));
        books.put("4", new Book("När Allt Är Över", "Charlotte Al-Khalili", "Comedy", true));
        books.put("5", new Book("En Underbar Resa", "Bengt Berg", "History", true));
        books.put("6", new Book("Intermezzo", "Sally Roomei", "Music", true));
        books.put("7", new Book("Förinta Världen Ikväll", "Stina jackson", "Crime", true));
        books.put("8", new Book("Havsörnens Skrik", "Karin Smirnoff", "Animals", true));
        books.put("9", new Book("Andra Kvinnors Liv", "Jojo Moyes", "Drama", true));
        books.put("10", new Book("Hundra Dagar I July", "Emelie Skepp", "Romance", true));





    }

}
