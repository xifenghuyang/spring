package b_conditional;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicConfig.class)
public class MagicTest {

    @Autowired(required = true)
    private MagicBean magicBean;

    @Test
    public void magicTest() {
        assertNotNull(magicBean);
        System.out.println("Name : " + magicBean.getName());
        System.out.println("Desc : " + magicBean.getDesc());
    }

    @BeforeClass
    public static void setEnvProperty() {
        System.setProperty("magic","null");
    }

}