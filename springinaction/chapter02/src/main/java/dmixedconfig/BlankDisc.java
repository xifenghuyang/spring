package dmixedconfig;

import java.util.List;

/**
 * @author admin
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    @Override
    public void play() {
        System.out.println("通过d_mixedConfig显示：");
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("Track: " + track);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
