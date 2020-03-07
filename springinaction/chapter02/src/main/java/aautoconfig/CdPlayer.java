package aautoconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yq
 */
@Component
public class CdPlayer implements MediaPlayer {

    @Autowired
    CompactDisc cd;

    @Override
    public void play(){
        cd.play();
    }
}
