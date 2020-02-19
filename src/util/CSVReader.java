package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.ArtistLinkedList;
import model.ArtistNode;
import model.Song;

public class CSVReader {

    private final static String cvsSplitBy = ",";

    public static ArtistLinkedList getSongsFromFile(String file) {
        FileReaderUtil fileReaderUtil = new FileReaderUtil();
        String line = "";
        //Our Array List
        List<Song> songsList = new ArrayList<>();
        ArtistLinkedList linkedList = new ArtistLinkedList();
        try (BufferedReader br = new BufferedReader(
                new FileReader(fileReaderUtil.getFileFromResources(file)))) {
            //program read line
            while ((line = br.readLine()) != null) {

                // program use comma as separator
                String[] newSong = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                Song song = new Song(Long.valueOf(newSong[0]), newSong[1], newSong[2],
                        Long.valueOf(newSong[3]));
                //feature to avoid names doubled in our list. Happened before with Ali Gatti;
                ArtistNode artistNode = new ArtistNode(song.getArtistName().replace("\"", ""));
                //insert Artist names
                songsList.add(song);
                linkedList.insert(artistNode);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linkedList;
    }
}