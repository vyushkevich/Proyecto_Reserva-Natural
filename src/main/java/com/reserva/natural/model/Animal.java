package com.reserva.natural.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import java.time.LocalDate;

@Entity
public class Animal {

   @Id
   private String nombre;
   
   @Column
   private String tipo;
   
   @Column
   private String familia;
   
   @Column
   private String genero;
   
   @Column
   private String paisOrigen;
   
   @Column
   private LocalDate fechaIngreso;
   
   @Column
   private String imagen;

   // Getters and Setters
}
