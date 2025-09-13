package mx.com.galmaraz.properties.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import mx.com.galmaraz.properties.constant.ApiConstant;
import mx.com.galmaraz.properties.service.ExampleService;

@Path(ApiConstant.PATH_BASE)
public class ExampleController {


    /**
     * Inyecta servicio
     */
    @Inject
    private ExampleService exampleService;

    @GET
    @Path(ApiConstant.PATH_V1_GET_VALUE)
    public String getValue(){
        return exampleService.getValue();
    }

}
