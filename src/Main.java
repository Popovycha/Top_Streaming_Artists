import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import model.ArtistLinkedList;
import util.CSVReader;

public class Main {

    public static void main(String[] args) {
        //Creation of a new file where program will put result
        File csvOutputFile = new File("result.csv");
        ArtistLinkedList linkedList = CSVReader.getSongsFromFile("regional-global-daily-latest.csv");

        try (PrintWriter writer = new PrintWriter(csvOutputFile)) {
            while (linkedList.head != null) {
                //adding name and how many times Artist comes up
                writer.write(linkedList.head.name + "," + linkedList.head.count + "\n");

                linkedList.head = linkedList.head.next;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}