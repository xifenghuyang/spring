package cxmlconfig;

/**
 * @author admin
 */
public class SgtPeppersDisc implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play(){
        System.out.println("Playing " + title + " by " + artist);
    }

}
