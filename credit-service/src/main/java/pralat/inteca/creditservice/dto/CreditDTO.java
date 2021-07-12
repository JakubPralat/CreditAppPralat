package pralat.inteca.creditservice.dto;

public class CreditDTO {
    private String firstName;
    private String surname;
    private String pesel;
    private String productName;
    private Integer value;
    private String creditName;

    public CreditDTO(String firstName, String surname, String pesel, String productName, Integer value, String creditName) {
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
        this.productName = productName;
        this.value = value;
        this.creditName = creditName;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }
}
