package e_runtimeinject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author admin
 */
@Configuration
@PropertySource(value = "classpath:e_runtimeInject/app.properties",encoding = "UTF-8")
public class EnvironmentConfigWithRequiredProperties {

    @Autowired
    private Environment environment;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(environment.getRequiredProperty("title"),
                environment.getRequiredProperty("artist"));
    }

}
