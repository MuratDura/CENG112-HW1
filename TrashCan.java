import javax.swing.*;

public class TrashCan implements IBag {

    private final Garbage[] trashCan;
    private int numberOfEntries;
    private static final int CAPACITY = 450;


    public TrashCan() {
        trashCan = new Garbage[CAPACITY];
        numberOfEntries = 0;

    }


    public static int getCAPACITY() {
        return CAPACITY;
    }

    @Override
    public boolean add(Object newItem) {
        // TODO Auto-generated method stub
        boolean result = true;
        if (isFull()) {
            result = false;
        } else { //result is true here
            trashCan[numberOfEntries] = (Garbage) newItem;
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
        return numberOfEntries >= trashCan.length;
    }

    public Garbage removeByIndex(int index) {
        Garbage result = null;
        if (!isEmpty() && (index >= 0)) {
            result = trashCan[index];
            trashCan[index] = trashCan[numberOfEntries - 1];
            trashCan[numberOfEntries - 1] = null;
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
            result = trashCan[numberOfEntries - 1];
            trashCan[numberOfEntries - 1] = null;
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
            if (item.equals(trashCan[index])) {
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
        for (Garbage garbage : trashCan) {
            System.out.println(garbage);
        }
    }


    @Override
    public void dump() {
        while (!isEmpty()) {
            remove();
        }
    }
    public int getCapacity(){return CAPACITY;}


    public boolean transferTo(IBag targetBag, Object item) {
        boolean result = true;
        if (!targetBag.isFull()) {
            targetBag.add(item);
        } else {
            result = false;
        }
        return result;
    }

    public boolean separate(IBag<Garbage> targetBag){
        boolean result = false;
        for (Garbage garbage : trashCan){
            if (targetBag.getClass().getName().toLowerCase().contains(garbage.getType())){
                transferTo(targetBag,garbage);
            }
            result = targetBag.isFull();
        }
        return result;
    }

    }



