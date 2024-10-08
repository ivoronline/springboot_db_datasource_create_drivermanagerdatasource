package com.ivoronline.springboot_db_datasource_create_drivermanagerdatasource.runner;

import com.ivoronline.springboot_db_datasource_create_drivermanagerdatasource.entity.Person;
import com.ivoronline.springboot_db_datasource_create_drivermanagerdatasource.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

  //PROPERTIES
  @Autowired
  PersonRepository repository;

  //=========================================================================================================
  // INSERT RECORDS
  //=========================================================================================================
  @Override
  public void run(String... args) {
    repository.save(new Person(0, "John" , 20));
  }

}
