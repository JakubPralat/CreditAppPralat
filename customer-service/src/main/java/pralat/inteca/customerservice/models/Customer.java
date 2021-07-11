package pralat.inteca.customerservice.models;

public class Customer {
    private Integer id;
    private Integer creditId;
    private String firstName;
    private String surname;
    private String pesel;

    public Customer() {
    }

    public Customer(Integer id, Integer creditId, String firstName, String surname, String pesel) {
        this.id = id;
        this.creditId = creditId;
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreditId() {
        return creditId;
    }

    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
