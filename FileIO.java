import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileIO {
    public void readTrashCan() {
        String fileName = "garbage.txt";
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int unit = line.lastIndexOf(",");
                line = line.replace("," + unit, "");
                for (int i = 0; unit > i; i++) {
                    Garbage Garbage = new Garbage(line);
                    TrashCan.add(Garbage);
                }
            }
            scanner.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
