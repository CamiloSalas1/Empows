package com.Empopasto.Ws.config;

//import com.Empopasto.sharingcoders.utils.ResourcesFile;
//import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication // Para indicarle a SpringBoot que esta es la clase de entrada del proyecto y
                       // además una clase de 'Configuracion'.
@EnableWebMvc // Para indicarle a Spring que este proyecto es de tipo web/servicioRest
              // (Controllers, Interceptors...)
@ComponentScan(basePackages = "com.Empopasto") // 'package base' a partir del cual Spring buscará clases de tipo 'Bean'
                                               // para convertir en 'Dependencias'.
@EnableJpaRepositories(basePackages = "com.Empopasto") // Para que Spring cree los objetos de tipo 'Repository'.
@EntityScan(basePackages = "com.Empopasto") // Para que Spring cree los objetos 'Entity' y sus correspondientes 'Tablas'
                                            // en la B.D.
@EnableTransactionManagement // Para poder realizar operaciones 'Transaccionales' contra la B.D.
public class SpringBootTomcatApplication extends SpringBootServletInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }
}