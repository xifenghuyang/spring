package dmixedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author admin
 */
@Configuration
@Import(CdPlayerConfig.class)
@ImportResource(locations = "classpath:dmixedconfigspring.xml")
public class SoundSystemConfig {
}
