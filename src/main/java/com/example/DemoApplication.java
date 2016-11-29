package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	//@Bean
    //public CommandLineRunner commandLineRunner() {
    //    return strings ->
      //          System.out.println("Executed at :" + 
     //                 new SimpleDateFormat().format(new Date()));
   // }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
