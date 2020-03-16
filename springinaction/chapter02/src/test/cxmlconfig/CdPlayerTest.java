package cxmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author admin
 */
public class CdPlayerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("cxmlconfigspring.xml");
        MediaPlayer mediaPlayer = context.getBean(CdPlayer.class);
        mediaPlayer.play();
        context.close();
    }

}