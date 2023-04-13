public class GarbageRecyclingApp {

    public static void main(String[] args) {
        FileIO file = new FileIO();
        IBag<Garbage> trashCan = file.readTrashCan();
        System.out.println("The Trash Can: capacity = " + trashCan.getCAPACITY() + ", size = " + trashCan.getItemCount());
        IBag<Garbage> plasticRecycleBin = new PlasticRecycleBin();
        PaperRecycleBin paperRecycleBin = new PaperRecycleBin();
        GlassRecycleBin glassRecycleBin = new GlassRecycleBin();
        FabricRecycleBin fabricRecycleBin = new FabricRecycleBin();
        MetalRecycleBin metalRecycleBin = new MetalRecycleBin();
        OrganicRecycleBin organicRecycleBin = new OrganicRecycleBin();
        trashCan.transferTo(paperRecycleBin, trashCan.removeByIndex(0));


        trashCan.displayItems();


    }

}
