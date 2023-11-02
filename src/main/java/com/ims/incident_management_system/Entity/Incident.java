package com.ims.incident_management_system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "INCIDENT")
public class Incident {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
}
