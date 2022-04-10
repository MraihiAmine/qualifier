package com.qualifier.qualifier;

import com.qualifier.qualifier.Service.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class QualifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierApplication.class, args);
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();

		// Scan beans
		context.scan("com.qualifier.qualifier.Service");
		context.refresh();

		VehicleService vehicle = context.getBean(VehicleService.class);
		vehicle.service();

		context.close();
	}

}
