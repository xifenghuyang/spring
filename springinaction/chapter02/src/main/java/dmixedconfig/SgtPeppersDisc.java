package dmixedconfig;

/**
 * @author admin
 */
public class SgtPeppersDisc implements CompactDisc {

    private String title = "轮回";
    private String artist = "五月天";


    @Override
    public void play() {
        System.out.println("通过mixedConfig显示：Playing "
                + title + " by " + artist);
    }
}
