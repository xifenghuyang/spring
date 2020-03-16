package dmixedconfig;

import java.util.Collections;

/**
 * @author admin
 */
public class CdPlayer implements MediaPlayer {

    private CompactDisc cd;

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public CompactDisc getCd() {
        return cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
