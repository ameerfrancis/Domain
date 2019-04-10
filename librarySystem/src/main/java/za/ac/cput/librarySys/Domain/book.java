package za.ac.cput.librarySys.Domain;

public class book {

    public static class Builder {
        String bookTitle;

        public Builder(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        @Override
        public String toString() {
            return "book{" +
                    "bookTitle='" + bookTitle + '\'' +
                    '}';
        }
    }
}
