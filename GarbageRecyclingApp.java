public class GarbageRecyclingApp {

    public static void main(String[] args) {
        FileIO file = new FileIO();
        TrashCan trashCan = (TrashCan) file.readTrashCan();
        PaperRecycleBin paperRecycleBin = new PaperRecycleBin();
        GlassRecycleBin glassRecycleBin = new GlassRecycleBin();
        PlasticRecycleBin plasticRecycleBin = new PlasticRecycleBin();
        OrganicRecycleBin organicRecycleBin = new OrganicRecycleBin();
        MetalRecycleBin metalRecycleBin = new MetalRecycleBin();
        FabricRecycleBin fabricRecycleBin = new FabricRecycleBin();


        System.out.println("The size of Trash Can is: " + trashCan.getItemCount() +
                " and the contents are:\n");
        trashCan.displayItems();
        System.out.println("--------------------------------------------");
        trashCan.separate(paperRecycleBin);
        System.out.print("The size of Paper Recycle Bin is: " + paperRecycleBin.getItemCount() +
                " and the contents are:\n");
        paperRecycleBin.displayItems();
        System.out.println("--------------------------------------------\n");
        trashCan.separate(glassRecycleBin);
        System.out.print("The size of Glass Recycle Bin is: " + glassRecycleBin.getItemCount() +
                " and the contents are:\n");
        glassRecycleBin.displayItems();
        System.out.println("--------------------------------------------\n");
        trashCan.separate(plasticRecycleBin);
        System.out.print("The size of Plastic Recycle Bin is: " + plasticRecycleBin.getItemCount() +
                " and the contents are:\n");
        plasticRecycleBin.displayItems();
        System.out.println("--------------------------------------------\n");
        trashCan.separate(organicRecycleBin);
        System.out.print("The size of Organic Recycle Bin is: " + organicRecycleBin.getItemCount() +
                " and the contents are:\n");
        organicRecycleBin.displayItems();
        System.out.println("--------------------------------------------\n");
        trashCan.separate(metalRecycleBin);
        System.out.print("The size of Metal Recycle Bin is: " + metalRecycleBin.getItemCount() +
                " and the contents are:\n");
        metalRecycleBin.displayItems();
        System.out.println("--------------------------------------------\n");
        trashCan.separate(fabricRecycleBin);
        System.out.print("The size of Fabric Recycle Bin is: " + fabricRecycleBin.getItemCount() +
                " and the contents are:\n");
        fabricRecycleBin.displayItems();
        System.out.println("--------------------------------------------\n");
        if (file.updateTrashCan(trashCan)){
            System.out.println("Garbage sorted successfully");
        }












    }

}
