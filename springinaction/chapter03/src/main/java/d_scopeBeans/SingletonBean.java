package d_scopeBeans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Getter
@Setter
@Component
public class SingletonBean {

    private String title;
}
