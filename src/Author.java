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
        return nameAuthor + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author1 = (Author) other;
        return nameAuthor.equals(author1.nameAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor);
    }
}