public class GarbageRecyclingApp {

    public static void main(String[] args) {
        TrashCan updatedTrashcan = new TrashCan();
        FileIO file = new FileIO();
        TrashCan trashcan =  (TrashCan) file.readTrashCan();

        MetalRecycleBin metalBin = new MetalRecycleBin();
        OrganicRecycleBin organicBin = new OrganicRecycleBin();
        PaperRecycleBin paperBin = new PaperRecycleBin();
        PlasticRecycleBin plasticBin = new PlasticRecycleBin();
        FabricRecycleBin fabricBin = new FabricRecycleBin();
        GlassRecycleBin glassBin = new GlassRecycleBin();

        System.out.println("Trash can size is "+trashcan.getCapacity()+" and contents:\n");
        trashcan.displayItems();

        trashcan.separate(plasticBin);
        plasticBin.displayItems();
        System.out.println(plasticBin.getItemCount());
            }

    }