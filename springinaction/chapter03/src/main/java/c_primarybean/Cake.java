package c_primarybean;

import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Component
public class Cake implements Dessert {

    @Override
    public String tasting() {
        return "The cake tastes sweet!";
    }

}
