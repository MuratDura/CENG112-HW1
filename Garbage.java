public class Garbage {

    private String name;
    private String type;
    private int amount;


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    public Garbage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + ", " + type ;
    }

    public boolean equals(Garbage obj) {
        return this.name.equals(obj.getName());
    }
}