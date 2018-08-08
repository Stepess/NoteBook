package ua.training.model.entity;

public class Record {

    private String login;
    private String email;
    private Address address;

    public Record() {
    }

    public Record(String login, String email, Address address) {
        this.login = login;
        this.email = email;
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    @Override
    public String toString() {
        return "Record{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
