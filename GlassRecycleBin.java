import java.util.Random;

public class GlassRecycleBin implements IBag{
    private final Garbage[] glassRecycleBin;
    private int numberOfEntries;
    private final int capacity;


    public GlassRecycleBin() {
        Random random = new Random();
        capacity = (random.nextInt(3) + 1)*5;
        glassRecycleBin = new Garbage[capacity];
        numberOfEntries = 0;
    }





    @Override
    public boolean add(Object newItem) {
        boolean result = true;
        if (isFull()) {
            result = false;
        } else { //result is true here
            glassRecycleBin[numberOfEntries] = (Garbage) newItem;
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
        return numberOfEntries >= glassRecycleBin.length;
    }

    public Garbage removeByIndex(int index) {
        Garbage result = null;
        if (!isEmpty() && (index >= 0)) {
            result = glassRecycleBin[index];
            glassRecycleBin[index] = glassRecycleBin[numberOfEntries - 1];
            glassRecycleBin[numberOfEntries - 1] = null;
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
            result = glassRecycleBin[numberOfEntries - 1];
            glassRecycleBin[numberOfEntries - 1] = null;
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
            if (item.equals(glassRecycleBin[index])) {
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
        for (Garbage garbage : glassRecycleBin) {
            System.out.println(garbage);
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

