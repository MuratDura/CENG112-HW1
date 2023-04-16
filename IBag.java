
public interface IBag<T> {
    public boolean add(T newItem); //Adds a new item to the bag and returns true if the addition is successful, otherwise returns false.
    public boolean isEmpty();    //Returns true if the bag is empty, otherwise returns false.
    public boolean isFull();     //Returns true if the bag is full, otherwise returns false.
    public T removeByIndex(int index);    //Removes the item at the specified index from the bag and returns it
    public T remove();   //Removes and returns the last item that was added to the bag.
    public T remove(T item); //Removes the specified item from the bag and returns it.
    public int getItemCount();  //Returns the number of items in the bag.
    public int getIndexOf(T item);  //Returns the index of the specified item in the bag, or -1 if the item is not found.
    public boolean contains(T item);  //Returns true if the bag contains the specified item, otherwise returns false.
    public void displayItems();   //Prints the items in the bag to the console.
    public void dump(); // removes all the items from the bag


}
