package d_scopeBeans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComponentScanConfig.class)
public class ScopedBeanTest {

    @Autowired
    private NotePad notePad1;
    @Autowired
    private NotePad notePad2;
    @Autowired
    private SingletonBean singletonBean1;
    @Autowired
    private SingletonBean singletonBean2;

    @Test
    public void testPropertype() {
        Assert.assertNotEquals(notePad1, notePad2);
        Assert.assertNotSame(notePad1, notePad2);
    }

    @Test
    public void testSingleton() {
        Assert.assertEquals(singletonBean1, singletonBean2);
        Assert.assertSame(singletonBean1, singletonBean2);
    }

}