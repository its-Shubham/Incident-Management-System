package com.ims.incident_management_system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String userName;

  private String userEmail;

  private String userAddress;

  private String userPhoneNumber;

  private String pincode;

  private String city;

  private String country;
}
