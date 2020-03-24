package e_runtimeinject.spelInject;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Getter
@Component
public class SpelDisc {

    private String title;
    private String artist;

    public SpelDisc(@Value("#{systemEnvironment['title']}") String title,
                    @Value("#{systemEnvironment['artist']}") String artist) {
        this.title = title;
        this.artist = artist;
    }
}
