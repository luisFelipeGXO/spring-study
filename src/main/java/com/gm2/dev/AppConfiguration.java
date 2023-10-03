package com.gm2.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public String getMessage(){
        return "<button>clique aqui rsrs</button>";
    }

    @Bean // indica que um método retorna um
    // objeto que deve ser gerenciado pelo contêiner Spring
    public void init() {
        System.out.println("Inicializado");
    }
}
