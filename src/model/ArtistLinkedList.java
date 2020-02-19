package model;

public class ArtistLinkedList {
    public ArtistNode head;

    public void insert(ArtistNode node) {
        ArtistNode current;
        //We are looking for name which we target and compare to next one
        if (head == null || head.name.compareToIgnoreCase(node.name) >= 0) {
            if (head != null && head.name.equals(node.name)) {
                head.count++; //make our list bigger
                return;
            }
            node.next = head;
            //we compare our nodes and if is not match we move to the head
            head = node;
        } else {

            current = head;
            //current is ArtistNode@867 "Dua Lipa" next: ArtistNode@860 "Karol G"
            while (current.next != null && (current.next.name.compareToIgnoreCase(node.name) <= 0)) {
                if (current.next.name.equals(node.name)) { //if current equal to node name we add to the list
                    current.next.count++;
                    return;
                }
                current = current.next;
            }

            node.next = current.next;
            current.next = node;
        }

    }
}
