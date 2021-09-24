package com.example.db.Model;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
@Component
public class DataConfigurationProfiler
{
    @Bean
    public DataSource embeddedDS(){
        System.out.println("Hello World");
        //return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.valueOf("DBCP Driver")).addScript("classpath:schema.sql")
        //        .addScript("classpath:data.sql").build();
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).addScript("classpath:schema.sql")
               .addScript("classpath:data.sql").build();
        //DriverManagerDataSource ds=new DriverManagerDataSource();
        //ds.setDriverClassName("H2 - commons-dbcp2-2.9.0");
        //ds.setUrl("jdbc:h2:E:/Software Setups/DBCP Driver/commons-dbcp2-2.9.0");
        //return ds;

    }
}
