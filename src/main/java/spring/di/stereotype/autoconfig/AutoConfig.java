package spring.di.stereotype.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Klasa konfiguracyjna dla Springa gdzie zadeklarowano autokonfigurację.
 * Sposoby definiowania beanów - jawne, poprzez adnotacje stereotype, xml można mieszać.
 */
@Configuration
@ComponentScan( // Włączenie automatycznego skanowania komponentów Spring Framework.
        value = "spring.di.stereotype.autoconfig") // Parametrem jest tutaj nazwa/y pakietów do skanowania. Domyślnie jeśli nie podamy nazwy pakietu przeskanowany zostanie pakiet gdzie umiesciliśmę tę adnotację.
public class AutoConfig {

}
