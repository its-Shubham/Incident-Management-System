package com.ims.incident_management_system.Service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Service
public class LocationService {

  public Map<String, String> getCityAndCountry(String pincode) throws IOException {
	  String response = getLocationResponse(pincode);
	  JSONObject jsonObject = new GSON
	  return new HashMap<>();
  }

  public String getLocationResponse(String pincode){
    try {
      URL locationApi =
          new URL(
              "http://api.geonames.org/postalCodeSearchJSON?postalcode="
                  + pincode
                  + "&username=shubham");
      Scanner scanner = new Scanner(locationApi.openStream());
      StringBuilder response = new StringBuilder();
      while (scanner.hasNext()) {
        response.append(scanner.hasNext());
      }
      scanner.close();
	  return response.toString();
    } catch (Exception e) {
		e.printStackTrace();
		return null;
    }
  }
}
