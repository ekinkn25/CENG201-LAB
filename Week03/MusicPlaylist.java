/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        Ekin Karıncalı
 * Your Student ID:  230446019
 * Your Date:        19.10.2026
 */

public class MusicPlaylist {

    //create private instants of the doubly linked list: 
    // -  head, tail and current
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    

    // constructor: The head,tail and current should be initialized to null in the beginning
    public MusicPlaylist(){
        head = null;
        tail = null;
        current = null;
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {

        // TODO
        // 1. Create a new SongNode
        SongNode newNode = new SongNode(title);

        // 2. If the playlist is empty, make the new node
        //    head, tail and current
        if(head == null){
            head = newNode;
            tail = newNode;
            current = newNode;
        }

        // 3. Otherwise, add the new node after tail
        else{
            tail.next = newNode;

            // 4. Update both next and prev pointer
            newNode.next = null;
            newNode.prev = tail;

            // 5. Update tail
            tail = tail.next;
        }
    }


    // Remove a song from the playlist
    public void removeSong(String title) {
        SongNode currentNode = head;

        // TODO
        // 1. Search for the song
        while(currentNode == tail){
            if(currentNode.title == title){
                currentNode.prev = currentNode.next;
            }

            // 2. If the song does not exist, display a message as: "The song isn't in the playlist"
            else{
                System.out.println("The song isn't in the playlist");
            }

            currentNode = currentNode.next;
            
        }
        
        // 3. Update the previous node's next pointer
        // 4. Update the next node's prev pointer
        // 5. Handle removing head
        // 6. Handle removing tail
        // 7. Handle removing the current song
    }


    // Move to the next song
    public void nextSong() {

        // TODO
        // If current is not null and current.next exists,
        // move current to current.next.
        //
        // Otherwise, display:
        // "Already at the last song of the playlist."
    }


    // Move to the previous song
    public void previousSong() {

        // TODO
        // If current is not null and current.prev exists,
        // move current to current.prev.
        //
        // Otherwise, display:
        // "Already at the first song of the playlist."
    }


    // Display the current song
    public void displayCurrentSong() {

        // TODO
        // Display the title of the current song.
    }


    // Display all songs
    public void displayPlaylist() {

        // TODO
        // Start from head and follow next pointer.
    }
}

