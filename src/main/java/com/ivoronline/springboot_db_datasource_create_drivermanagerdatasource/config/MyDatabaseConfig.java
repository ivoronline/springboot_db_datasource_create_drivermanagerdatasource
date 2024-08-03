package com.ivoronline.springboot_db_datasource_create_drivermanagerdatasource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class MyDatabaseConfig {

  //=========================================================================================================
  // DATA SOURCE
  //=========================================================================================================
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
                            dataSource.setUrl            ("jdbc:oracle:thin:@localhost:1522/orcl");
                            dataSource.setUsername       ("TEST");
                            dataSource.setPassword       ("LETMEIN");
                          //dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
    return dataSource;
  }

}
