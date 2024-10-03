import java.time.LocalDate;

public class BookInfo {
    private User user;
    private Book book;
    private LocalDate lendingDate;
    private LocalDate returnDate;




    public BookInfo(User user, Book book, LocalDate lendingDate, LocalDate returnDate) {
        this.user = user;
        this.book = book;
        this.lendingDate = lendingDate;
        this.returnDate = returnDate;
    }




}
