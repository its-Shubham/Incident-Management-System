package com.ims.incident_management_system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@Autowired



	@GetMapping("/getCityAndCountry/{pincode}")
	public ResponseEntity getCityAndCountry(@PathVariable String pincode){
		try{

			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
