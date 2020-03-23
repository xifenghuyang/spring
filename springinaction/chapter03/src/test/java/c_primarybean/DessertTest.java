package c_primarybean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {

    /** 带@primary的bean **/
    @Autowired
    private Dessert dessert;

    /** 系统默认bean的id就是限定符 **/
    @Autowired
    @Qualifier("cake")
    private Dessert dessertCake;

    /** 自定义限定符 **/
    @Autowired
    @Qualifier("greasyCookie")
    private Dessert dessertCookie;

    @Test
    public void testDessert() {
        System.out.println(dessert.tasting());
    }

    @Test
    public void testQualifier() {
        System.out.println(dessertCake.tasting());
    }

    @Test
    public void testMyselfQualifier() {
        System.out.println(dessertCookie.tasting());
    }

}