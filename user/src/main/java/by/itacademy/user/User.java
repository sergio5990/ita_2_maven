package by.itacademy.user;

public class User {
    private final String id;
    private final String firstName;
    private final String lastName;

    public User(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return NameUtil.formatName(this.getFirstName(), this.getLastName());
    }
}
