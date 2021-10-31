package com.json;

 /***
  * @author Miromar Junior
  */

import java.io.PrintWriter;
import java.io.FileNotFoundException;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskJsonMiromarApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(TaskJsonMiromarApplication.class, args);
		
       JSONObject json = new JSONObject();
	   	
       
       
       json.put("Nome", "Miromar Francisco de Alcantara Junior");
       json.put("Cidade", "Aparecida de Goiânia");
       json.put("Email", "miromarjunior@gmail.com");
       json.put("Idade", 36);
       
		
	System.out.println(json);
	
	PrintWriter salvar = new PrintWriter("./src/main/java/miromar.json");
	salvar.write(json.toJSONString());
	
	salvar.flush();
	salvar.close();
	
		
		
		
	}

}
