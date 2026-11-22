

public class Item {

    private String name;
    private String type;
    private double value;

    // Constructor
    public Item(String name, String type, double value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
