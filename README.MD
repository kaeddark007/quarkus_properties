# Quarkus Properties

El objetivo de este ejemplo, es mostrar un proyecto sencillo que muestra como configurar diferentes properties que se pueden utilizar según un ambiente o configuración

Puedes ejecutar el proyecto con uno de los siguientes comandos:

> Requiere quarkus cli
```sh
quarkus dev
```



> Requiere maven 3.9.x

```sh
mvn quarkus:dev
```

## El proyecto cuenta con la sigueinte estructura

```
├── config
│   ├── application-dev.properties
│   └── application-qa.properties
├── pom.xml
├── README.MD
├── src
│   └── main
│       ├── java
│       │   └── mx.com.galmaraz.properties
│       │       ├── business
│       │       │   └── ExampleBusiness.java
│       │       ├── constant
│       │       │   ├── ApiConstant.java
│       │       │   └── Constants.java
│       │       ├── controller
│       │       │   └── ExampleController.java
│       │       └── service
│       │           └── ExampleService.java
│       └── resources
│           └── application.properties
```

En la carpeta **config** se encuentran los archivos de propiedades que se pueden utilizar según la configuración asignada en el archivo de propiedades de la carpeta **resources**

La propiedad en cuestión es: **quarkus.config.locations**
> quarkus.config.locations=ruta_de_propiedades