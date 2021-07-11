package pralat.inteca.creditservice.models;

public class Product {
    private Integer id;
    private Integer creditId;
    private String name;
    private Integer value;

    public Product() {
    }

    public Product(Integer id, Integer creditId, String name, Integer value) {
        this.id = id;
        this.creditId = creditId;
        this.name = name;
        this.value = value;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
