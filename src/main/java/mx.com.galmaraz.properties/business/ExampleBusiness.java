package mx.com.galmaraz.properties.business;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import mx.com.galmaraz.properties.constant.Constants;
import mx.com.galmaraz.properties.service.ExampleService;

/**
 * Clase negocio que implementa los métodos
 * @author gari.almaraz
 */
@ApplicationScoped
public class ExampleBusiness implements ExampleService {

    /**
     * Inyecta constantes
     */
    @Inject
    private Constants constants;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getValue() {
        return constants.getValueEnvironment();
    }
}
