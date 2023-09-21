package br.com.unicsul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

        @Bean (name = "appDescricao")
        public  String appDescricao(){
        return "descricao";
        }

        @Bean(name = "appVersion")
        public String appVersion() { return "Versão 1.0.0"; }

}
