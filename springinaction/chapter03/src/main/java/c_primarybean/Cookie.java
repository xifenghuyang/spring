package c_primarybean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Component
@Qualifier("greasyCookie")
public class Cookie implements Dessert {
    @Override
    public String tasting() {
        return "The cookie tastes greasy!";
    }
}
