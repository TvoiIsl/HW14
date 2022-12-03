import java.util.Objects;
public class Author {
    private String nameAuthor;
    private String surname;

    public Author(String nameAuthor, String surname) {
        this.nameAuthor = nameAuthor;
        this.surname = surname;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return nameAuthor +" "+ surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author2 = (Author) other;
        return nameAuthor.equals(author2.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor);
    }
}