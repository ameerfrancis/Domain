package za.ac.cput.librarySys.Domain;

public class bookGenre {

    public static class Builder {

        String genreName;

        public Builder(String genreName) {
            this.genreName = genreName;
        }

        public String getGenreName() {
            return genreName;
        }

        public void setGenreName(String genreName) {
            this.genreName = genreName;
        }

        @Override
        public String toString() {
            return "bookGenre{" +
                    "genreName='" + genreName + '\'' +
                    '}';
        }
    }
}
