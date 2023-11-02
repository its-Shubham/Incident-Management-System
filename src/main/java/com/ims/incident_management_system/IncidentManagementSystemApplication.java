package com.ims.incident_management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class IncidentManagementSystemApplication {
  static final Logger logger = Logger.getLogger(IncidentManagementSystemApplication.class.getName());
  public static void main(String[] args) {
    SpringApplication.run(IncidentManagementSystemApplication.class, args);
    logger.info("INCIDENT MANAGEMENT SYSTEM STARTED....................................");
  }
}
