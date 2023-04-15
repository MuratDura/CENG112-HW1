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


        while(!trashcan.isEmpty()){
            Garbage garbage = trashcan.remove();
            String garb = garbage.toString();
            String[] garbagelist = garb.split(",");
            String type = garbagelist[1].trim();
            if (garbage.equals("plastic")) {
                if (plasticBin.transferTo(plasticBin, garbage)) {
                    continue;
                } else updatedTrashcan.transferTo(updatedTrashcan, garbage);
            }
            if (garbage.equals("metal")) {
                if (metalBin.add(garbage)) {continue;}
                else updatedTrashcan.transferTo(updatedTrashcan,garbage);}
            if (garbage.equals("glass")) {
                if (glassBin.transferTo(glassBin, garbage)) {continue;}
                else updatedTrashcan.transferTo(updatedTrashcan,garbage);}
            if (garbage.equals("paper")) {
                if (paperBin.transferTo(paperBin, garbage)) {continue;}
                else updatedTrashcan.transferTo(updatedTrashcan,garbage);}
            if (garbage.equals("organic")) {
                if (organicBin.transferTo(organicBin, garbage)) {continue;}
                else updatedTrashcan.transferTo(updatedTrashcan,garbage);}
            if (garbage.equals("fabric")) {
                if (fabricBin.transferTo(fabricBin, garbage)) {continue;}
                else updatedTrashcan.transferTo(updatedTrashcan,garbage);}
            }
        organicBin.displayItems();
            }

    }


