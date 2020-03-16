package dmixedconfig;

import org.springframework.context.annotation.Bean;

/**
 * @author admin
 */
public class CdPlayerConfig {

    @Bean
    public MediaPlayer mediaPlayer(CompactDisc cd){
        CdPlayer cdPlayer = new CdPlayer();
        cdPlayer.setCd(cd);
        return cdPlayer;
    }

}
