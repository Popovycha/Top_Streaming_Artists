package model;

public class ArtistNode {
    public String name;
    public ArtistNode next;
    public int count;
  //Creation of a new node with Artist name
    public ArtistNode(String name) {
        this.name = name;
        this.next = null;
        this.count = 1;
    }
}
