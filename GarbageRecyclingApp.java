public class GarbageRecyclingApp {

    public static void main(String[] args) {
        FileIO file = new FileIO();
        IBag<Garbage> trashcan =  file.readTrashCan();

        MetalRecycleBin metalBin = new MetalRecycleBin();
        OrganicRecycleBin organicBin = new OrganicRecycleBin();
        PaperRecycleBin paperBin = new PaperRecycleBin();
        PlasticRecycleBin plasticBin = new PlasticRecycleBin();
        FabricRecycleBin fabricBin = new FabricRecycleBin();
        GlassRecycleBin glassBin = new GlassRecycleBin();




    }

}
