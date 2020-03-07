package aautoconfig;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppersDisc implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("通过autoConfig显示：Playing " + title + " by " + artist);
    }

}
