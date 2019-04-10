package za.ac.cput.librarySys.Domain;

public class university {

    public static class Builder {

        String uniName;

        public Builder(String uniName) {
            this.uniName = uniName;
        }

        public String getUniName() {
            return uniName;
        }

        public void setUniName(String uniName) {
            this.uniName = uniName;
        }

        @Override
        public String toString() {
            return "university{" +
                    "uniName='" + uniName + '\'' +
                    '}';
        }
    }
}

