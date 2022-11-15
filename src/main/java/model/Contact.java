package model;

public class Contact {

    private String lastName;
    private String accountName;

    public Contact(String lastName, String accountName) {
        this.lastName = lastName;
        this.accountName = accountName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountName() {
        return accountName;
    }
}
