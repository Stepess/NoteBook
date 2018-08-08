package ua.training.model.entity;

public class Record {

    private String login;
    private String firstName;
    private String email;
    private Address address;

    public Record(String login, String firstName, String email, Address address) {
        this.login = login;
        this.firstName = firstName;
        this.email = email;
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
