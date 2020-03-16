package dmixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author admin
 */
@Configuration
public class CdConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppersDisc();
    }

}
