package e_runtimeinject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author admin
 */
@ContextConfiguration
@PropertySource(value = "classpath:e_runtimeInject/app.properties",encoding = "UTF-8")
public class EnvironmentConfigWithDefault {

    @Autowired
    private Environment environment;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(environment.getProperty("titleWithDefault","发如雪"),
        environment.getProperty("artistWithDefault","周杰伦"));
    }

}
