package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * 
 * @author Miromar Junior
 *
 */

public class LeituraJson {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		Object obj = new JSONParser().parse(new FileReader("./src/main/java/miromar.json"));

		JSONObject json = (JSONObject) obj;
		

		
		Iterator<String> iterator = json.keySet().iterator();
		while (iterator.hasNext()) {
			Object campo = iterator.next();
			Object valor = json.get(campo);

			System.out.println(campo +  " : " +  valor);
		}

	}

}
