package cxmlconfig;

/**
 * @author admin
 */
public class CdPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CdPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play(){
        cd.play();
    }

}
