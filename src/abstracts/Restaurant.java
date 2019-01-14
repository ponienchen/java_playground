package abstracts;

public abstract class Restaurant {

    private String name;
    private String address;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract double value();
    public abstract int number_of_staff();
}
