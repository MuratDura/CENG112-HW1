public class GarbageRecyclingApp {

    public static void main(String[] args) {
        FileIO file = new FileIO();
        TrashCan trashcan =  (TrashCan) file.readTrashCan();

        MetalRecycleBin metalBin = new MetalRecycleBin();
        OrganicRecycleBin organicBin = new OrganicRecycleBin();
        PaperRecycleBin paperBin = new PaperRecycleBin();
        PlasticRecycleBin plasticBin = new PlasticRecycleBin();
        FabricRecycleBin fabricBin = new FabricRecycleBin();
        GlassRecycleBin glassBin = new GlassRecycleBin();

        System.out.println("Trash can size is "+trashcan.getItemCount()+" and contents:\n");
        trashcan.displayItems();

        System.out.println("\nMetal recycle bin size is "+metalBin.getItemCount()+" and contents:\n");
        trashcan.separate(metalBin);
        metalBin.displayItems();

        System.out.println("\nPaper recycle bin size is "+paperBin.getItemCount()+" and contents:\n");
        trashcan.separate(paperBin);
        paperBin.displayItems();

        System.out.println("\nOrganic recycle bin size is "+organicBin.getItemCount()+" and contents:\n");
        trashcan.separate(organicBin);
        organicBin.displayItems();

        System.out.println("\nPlastic recycle bin size is "+plasticBin.getItemCount() +" and contents:\n");
        trashcan.separate(plasticBin);
        plasticBin.displayItems();

        System.out.println("\nFabric recycle bin size is "+fabricBin.getItemCount()+" and contents:\n");
        trashcan.separate(fabricBin);
        fabricBin.displayItems();

        System.out.println("\nGlass recycle bin size is "+glassBin.getItemCount()+" and contents:\n");
        trashcan.separate(glassBin);
        glassBin.displayItems();

        System.out.println("Updated trash can size is "+trashcan.getItemCount()+" and contents:\n");
        trashcan.displayItems();

        file.updateTrashCan(trashcan);
            }
    }