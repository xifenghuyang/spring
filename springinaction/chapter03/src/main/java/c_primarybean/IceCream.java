package c_primarybean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Component
@Primary
public class IceCream implements Dessert {
    @Override
    public String tasting() {
        return "The iceCream tastes cold and sweet!";
    }
}
