package model;
public class Song {

    private long position;
    private String trackName;
    private String artistName;
    private long numberStreamed;
//Constructor
    public Song(long position, String trackName, String artistName, long numberStreamed) {
        this.position = position;
        this.trackName = trackName;
        this.artistName = artistName;
        this.numberStreamed = numberStreamed;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public long getNumberStreamed() {
        return numberStreamed;
    }

    public void setNumberStreamed(long numberStreamed) {
        this.numberStreamed = numberStreamed;
    }

    @Override
    public String toString() {
        return "Song{" +
                "position=" + position +
                ", trackName='" + trackName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", numberStreamed=" + numberStreamed +
                '}';
    }
}
