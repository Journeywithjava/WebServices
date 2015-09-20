package com.journeywithjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Client {

	/* Replace the following string as per the service. */
	private static final String GOOGLE_MAPS_API ="https://maps.googleapis.com/maps/api/distancematrix/json?"
			+ "origins=32.881601,-96.961739&destinations=33.083134,-96.816199&key=AIzaSyAguR1lLP2ANAWFnvmPNwSxYn4RtgspbPk";
	
	public static void main(String[] args) throws IOException {
		URL url = new URL(GOOGLE_MAPS_API);
		InputStream inputStream = null;
		URLConnection urlConnection = url.openConnection();
		if(urlConnection != null){
			inputStream = urlConnection.getInputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line=null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		}else{
			System.out.println("Failed to get the connection object.");
		}
	}

}
