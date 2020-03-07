package bjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 */
@Configuration
public class CdPlayerConfig {

    @Bean
    public CompactDisc compactDisk(){
        return new SgtPeppersDisc();
    }

    @Bean
    public MediaPlayer mediaPlayer(CompactDisc cd){
        return new CdPlayer(cd);
    }

}
