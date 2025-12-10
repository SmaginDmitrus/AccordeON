package com.github.smagindmitrus.AccordeON;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@AllArgsConstructor
public class AccordeonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccordeonApplication.class);
	}

}
