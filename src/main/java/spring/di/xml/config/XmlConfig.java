package spring.di.xml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Pobranie konfiguracji z pliku Xml.
 */
@Configuration
@ImportResource("classpath*:configuration.xml")
public class XmlConfig {
}
