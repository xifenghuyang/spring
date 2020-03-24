package e_runtimeinject;

import lombok.Getter;

/**
 * @author admin
 */
@Getter
public class BlankDisc {

    private final String title;
    private final String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}
