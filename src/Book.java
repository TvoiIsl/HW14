public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publisherYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publisherYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return bookName + authorName + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return bookName.equals(book1.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}
