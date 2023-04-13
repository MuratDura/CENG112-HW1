public class Garbage {

    private String name;
    private String type;
    private String amount;


    public Garbage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + ", " + type;
    }

    public boolean equals(Object obj) {
        return false;
    }
}