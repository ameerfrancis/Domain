package za.ac.cput.librarySys.Domain;

public class library {

    public static class Builder {

        String libName;

        public Builder(String libName) {
            this.libName = libName;
        }

        public String getLibName() {
            return libName;
        }

        public void setLibName(String libName) {
            this.libName = libName;
        }

        @Override
        public String toString() {
            return "library{" +
                    "libName='" + libName + '\'' +
                    '}';
        }
    }
}
