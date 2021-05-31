import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public void songLyrics(){
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("Goodbye Yellow Brick Road", "Mongrels, Who aint got a penny");
        songs.put("Don't Stop Me Now", "Im a shooting star leaping throught the sky like a tiger");
        songs.put("Stay with Me", "Stay with me, mayonaka no door wo tataki");
        songs.put("Psycho Killer", "Psycho killer, qu'est-ce que c'est");

        System.out.println(songs.keySet());

        Set<String> tracklist = songs.keySet();
        for(String song: tracklist){
            System.out.println("Title: " + song + " Lyrics: " + songs.get(song));
        }
    }
}