public class Author {
    protected String fullName = "Azak Jolchuev";
    private String email;
    protected char gender = 'm';

    public Author(String fullName, String email, char gender) {
        this.fullName = fullName;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}
