import java.util.Random;

public class PlasticRecycleBin implements IBag {

    private final Garbage[] plasticRecycleBin;
    private int numberOfEntries;
    private final int capacity;


    public PlasticRecycleBin() {
        Random random = new Random();
        capacity = (random.nextInt(3)+1)*5;
        plasticRecycleBin = new Garbage[capacity];
        numberOfEntries = 0;
    }



    @Override
    public boolean add(Object newItem) {
        // TODO Auto-generated method stub
        boolean result = true;
        if (isFull()) {
            result = false;
        } else { //result is true here
            plasticRecycleBin[numberOfEntries] = (Garbage) newItem;
            numberOfEntries++;
        }
        return result;
    }
    public int getCapacity(){return capacity;}


    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries >= plasticRecycleBin.length;
    }

    public Garbage removeByIndex(int index) {
        Garbage result = null;
        if (!isEmpty() && (index >= 0)) {
            result = plasticRecycleBin[index];
            plasticRecycleBin[index] = plasticRecycleBin[numberOfEntries - 1];
            plasticRecycleBin[numberOfEntries - 1] = null;
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
            result = plasticRecycleBin[numberOfEntries - 1];
            plasticRecycleBin[numberOfEntries - 1] = null;
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
            if (item.equals(plasticRecycleBin[index])) {
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
        for (Garbage garbage : plasticRecycleBin) {
            System.out.println(garbage);
        }
    }


    @Override
    public void dump() {
        while (!isEmpty()) {
            remove();
        }
    }

    public boolean transferTo(IBag<Garbage> targetBag, Garbage item) {
        boolean result = true;
        if (!targetBag.isFull()) {
            targetBag.add(item);
        } else {
            result = false;
        }
        return result;
    }
}
