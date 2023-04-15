import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileIO {

    public IBag<Garbage> readTrashCan(){
        @SuppressWarnings("unchecked")
        IBag<Garbage> trashCan = new TrashCan();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("garbage.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                String[] garbage = line.split(",");
                int amount = Integer.parseInt(garbage[2].trim());
                for (int i = 0; i < amount; i++) {
                    trashCan.add(new Garbage(garbage[0].trim(),garbage[1].trim(),garbage[2].trim()));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trashCan;
    }


    public boolean updateTrashCan(IBag<Garbage> trashCan) {
        boolean result = true;
        try {
            FileWriter myWriter = new FileWriter("updated-garbage.txt");
            while (!trashCan.isEmpty()) {
                String garbage = trashCan.remove().toString();
                myWriter.write(garbage + "\n"); // Her öğeyi dosyaya bir satırda yazdır
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

