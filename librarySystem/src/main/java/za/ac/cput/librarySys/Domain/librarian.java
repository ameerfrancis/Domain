package za.ac.cput.librarySys.Domain;

public class librarian {

    public static class Builder {

        String librarianName;

        public Builder(String librarianName) {
            this.librarianName = librarianName;
        }

        public String getLibrarianName() {
            return librarianName;
        }

        @Override
        public String toString() {
            return "librarian{" +
                    "librarianName='" + librarianName + '\'' +
                    '}';
        }
    }
}
