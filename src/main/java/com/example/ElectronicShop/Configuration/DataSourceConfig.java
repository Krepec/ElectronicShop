package com.example.ElectronicShop.Configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
public class DataSourceConfig {

    @Bean
    public DataSource getDatasurce(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/sklep");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("1234");
        return dataSourceBuilder.build();
    }


}
