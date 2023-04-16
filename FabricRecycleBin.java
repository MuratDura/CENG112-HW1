import java.util.Random;
public class FabricRecycleBin implements IBag {

    private final Garbage[] fabricRecycleBin;
    private intimport java.util.Random;

public class FabricRecycleBin implements IBag {

    private final Garbage[] fabricRecycleBin;
    private int numberOfEntries;
    private final int capacity;

    // Constructor that initializes the capacity of the recycle bin
    public FabricRecycleBin() {
        Random random = new Random();
        capacity = (random.nextInt(3) + 1)*5;
        fabricRecycleBin = new Garbage[capacity];
        numberOfEntries = 0;
    }

    // Method to get the capacity of the recycle bin
    public int getCapacity(){
        return capacity;
    }

    // Method to add an item to the recycle bin
    @Override
    public boolean add(Object newItem) {
        boolean result = true;
        if (isFull()) {
            result = false;
        } else {
            fabricRecycleBin[numberOfEntries] = (Garbage) newItem;
            numberOfEntries++;
        }
        return result;
    }

    // Method to check if the recycle bin is empty
    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    // Method to check if the recycle bin is full
    @Override
    public boolean isFull() {
        return numberOfEntries >= fabricRecycleBin.length;
    }

    // Method to remove an item from the recycle bin by its index
    public Garbage removeByIndex(int index) {
        Garbage result = null;
        if (!isEmpty() && (index >= 0)) {
            result = fabricRecycleBin[index];
            fabricRecycleBin[index] = fabricRecycleBin[numberOfEntries - 1];
            fabricRecycleBin[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
        return result;
    }

    // Method to remove an item from the recycle bin
    public Object remove(Object item) {
        int index = getIndexOf(item);
        return removeByIndex(index);
    }

    // Method to remove the last item from the recycle bin
    @Override
    public Garbage remove() {
        Garbage result = null;
        if (numberOfEntries > 0) {
            result = fabricRecycleBin[numberOfEntries - 1];
            fabricRecycleBin[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
        return result;
    }

    // Method to get the number of items in the recycle bin
    @Override
    public int getItemCount() {
        return numberOfEntries;
    }

    // Method to get the index of an item in the recycle bin
    public int getIndexOf(Object item) {
        int where = -1;
        boolean found = false;
        int index = 0;
        while (!found && (index < numberOfEntries)) {
            if (item.equals(fabricRecycleBin[index])) {
                found = true;
                where = index;
            }
            index++;
        }
        return where;
    }

    // Method to check if the recycle bin contains an item
    @Override
    public boolean contains(Object item) {
        return getIndexOf(item) > -1;
    }

    // Method to display the items in the recycle bin
    public void displayItems() {
        for (Garbage garbage : fabricRecycleBin) {
            if (garbage != null){
                System.out.println(garbage);
            }
        }
    }

    // Method to remove all the items from the recycle bin
    @Override
    public void dump() {
        while (!isEmpty()) {
            remove();
        }
    }

    // Method to transfer an item to another bag
    public boolean transferTo(IB
 numberOfEntries;
    private final int capacity;


    public FabricRecycleBin() {
        Random random = new Random();
        capacity = (random.nextInt(3) + 1)*5;
        fabricRecycleBin = new Garbage[capacity];
        numberOfEntries = 0;
    }

    public int getCapacity(){
        return capacity;
    }



    @Override
    public boolean add(Object newItem) {
        boolean result = true;
        if (isFull()) {
            result = false;
        } else { //result is true here
            fabricRecycleBin[numberOfEntries] = (Garbage) newItem;
            numberOfEntries++;
        }
        return result;
    }


    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries >= fabricRecycleBin.length;
    }

    public Garbage removeByIndex(int index) {
        Garbage result = null;
        if (!isEmpty() && (index >= 0)) {
            result = fabricRecycleBin[index];
            fabricRecycleBin[index] = fabricRecycleBin[numberOfEntries - 1];
            fabricRecycleBin[numberOfEntries - 1] = null;
            numberOfEntries--;
        }
        return result;
    }


    public Object remove(Object item) {
        int index = getIndexOf(item);
        return removeByIndex(index);
    }

    @Override
    public Garbage remove() {
        Garbage result = null;
        if (numberOfEntries > 0) {
            result = fabricRecycleBin[numberOfEntries - 1];
            fabricRecycleBin[numberOfEntries - 1] = null;
            numberOfEntries--;
        } // end if
        return result;
    }




    @Override
    public int getItemCount() {
        return numberOfEntries;
    }

    public int getIndexOf(Object item) {
        int where = -1;
        boolean found = false;
        int index = 0;
        while (!found && (index < numberOfEntries)) {
            if (item.equals(fabricRecycleBin[index])) {
                found = true;
                where = index;
            }
            index++;
        }
        return where;
    }

    @Override
    public boolean contains(Object item) {
        return getIndexOf(item) > -1;
    }

    public void displayItems() {
        for (Garbage garbage : fabricRecycleBin) {
            if (garbage != null){
                System.out.println(garbage);
            }
        }
    }


    @Override
    public void dump() {
        while (!isEmpty()) {
            remove();
        }
    }

    public boolean transferTo(IBag targetBag, Object item) {
        boolean result = true;
        if (!targetBag.isFull()) {
            targetBag.add(item);
        } else {
            result = false;
        }
        return result;
    }
}
