package com.mx.ExamenCurso.ExamenMelq.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Clientes")
public class Clientes {
	@Id
	private int id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int edad;
	private String domicilio;
	private String sexo;
	private String edo_Civil;
}
/*
CREATE TABLE CLIENTES (ID NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(100),
APELLIDO_PATERNO NVARCHAR2(100), 
APELLIDO_MATERNO NVARCHAR2(100),
EDAD NUMBER,
DOMICILIO NVARCHAR2(100),
SEXO NVARCHAR2(5),
EDO_CIVIL NVARCHAR2(20))

 */
 
