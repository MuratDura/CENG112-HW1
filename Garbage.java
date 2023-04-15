import jdk.dynalink.NamedOperation;

public class Garbage {

    private String name;
    private String type;
    private String amount;


    public Garbage(String name, String type,String amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
    }
    public String getType(){return type;}
    @Override
    public String toString() {
        return name + "," + type + "," + amount;
    }

    public boolean equals(Object obj) {
        return false;
    }
}