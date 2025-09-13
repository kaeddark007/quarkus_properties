package mx.com.galmaraz.properties.constant;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * Clase que implementa la lógica de negocio.
 *
 * @author gari.almaraz
 */
@Getter
@ApplicationScoped
public class Constants {

    @ConfigProperty(name = "constants.message.example.value")
    public String valueEnvironment;

}
