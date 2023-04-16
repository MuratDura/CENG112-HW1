// This class can be used in various applications such as waste management systems.
public class Garbage {

    // It holds the properties of name, type, and amount.
    private String name;
    private String type;
    private int amount;

    // Returns the type of the Garbage object.
    public String getType() {
        return type;
    }

    // Returns the name of the Garbage object.
    public String getName() {
        return name;
    }

    // Constructor method that takes two parameters, name and type.
    public Garbage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Returns a string representation of the Garbage object.
    @Override
    public String toString() {
        return name + ", " + type ;
    }

    // Checks if two Garbage objects have the same name.
    public boolean equals(Garbage obj) {
        return this.name.equals(obj.getName());
    }
}
