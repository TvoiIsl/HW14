public class Author {
    private String nameAuthor;

    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }
    @Override
    public String toString() {
        return nameAuthor;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author1 = (Author) other;
        return nameAuthor.equals(author1.nameAuthor);
    }
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor);
    }
}