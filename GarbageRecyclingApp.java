public class GarbageRecyclingApp {

    public static void main(String[] args) {
        FileIO file = new FileIO();
        IBag<Garbage> trashcan =  file.readTrashCan();
        trashcan.displayItems();





    }

}
