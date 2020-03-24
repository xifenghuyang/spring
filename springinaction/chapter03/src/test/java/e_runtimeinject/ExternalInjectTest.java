package e_runtimeinject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.midi.Soundbank;

import static org.junit.Assert.*;

/**
 * @author admin
 */
public class ExternalInjectTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = EnvironmentConfig.class)
    public static class EnvironmentConfigTest {

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void environmentConfigTest() {
            System.out.println(blankDisc.getTitle() + " by " + blankDisc.getArtist());
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = EnvironmentConfigWithDefault.class)
    public static class EnvironmentConfigWithDefaultTest {

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void environmentConfigWithDefaultTest() {
            System.out.println(blankDisc.getTitle() + " by " + blankDisc.getArtist());
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = EnvironmentConfigWithRequiredProperties.class)
    public static class EnvironmentConfigWithRequiredPropertiesTest {

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void environmentConfigRequiredPropertiesTest() {
            System.out.println(blankDisc.getTitle() + " by " + blankDisc.getArtist());
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:e_runtimeInject/spring.xml")
    public static class EnvironmentConfigTest_XMLConfig {

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void environmentConfigTest_XMLConfig() {
            System.out.println(blankDisc.getTitle() + " by "
                    + blankDisc.getArtist());
        }

    }

}