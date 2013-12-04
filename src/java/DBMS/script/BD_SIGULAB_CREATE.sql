--******************************************************************************
--********************************* DROP ***************************************
--******************************************************************************

DROP TABLE POSTGRADO;
DROP TABLE PREGRADO;
DROP TABLE ESTUDIANTE;
DROP TABLE PROFESOR;
DROP TABLE USUARIO;
DROP TYPE tipo_usuario;
DROP TYPE tipo_estudiante;


--******************************************************************************
--************************* CREACION DE TABLAS *********************************
--******************************************************************************

CREATE TYPE tipo_usuario AS ENUM ('estudiante','profesor','empleado');
CREATE TYPE tipo_estudiante AS ENUM ('pregrado','postgrado');
CREATE TYPE tipo_empleado AS ENUM ('personal admin','tecnico','jefe');


CREATE TABLE USUARIO (
  usbid					varchar(15)		PRIMARY KEY,
  nombres				varchar(20)		NOT NULL,
  apellidos				varchar(20)		NOT NULL,
  cedula				integer			NOT NULL,
  correo				varchar(30) 	NOT NULL,
  direccion 			varchar(50)		NOT NULL,
  telefono_casa 		varchar(12)		NOT NULL,
  telefono_celular 		varchar(12)		NOT NULL,
  tipo 					tipo_usuario	NOT NULL
);

CREATE TABLE ESTUDIANTE (
  usbid			varchar(15)           	PRIMARY KEY references USUARIO(usbid),
  carnet		varchar(8)				NOT NULL,
  tipo			tipo_estudiante       	NOT NULL
);

CREATE TABLE PROFESOR (
  usbid			varchar(15)           	PRIMARY KEY references USUARIO(usbid)
);

CREATE TABLE EMPLEADO (
  usbid			varchar(15)           	PRIMARY KEY references USUARIO(usbid),
  cargo			varchar(30)				NOT NULL,
  antiguedad	varchar(30)				NOT NULL,
  tipo			tipo_empleado       	NOT NULL
);


--******************************************************************************
--******************************* TRIGGERS *************************************
--******************************************************************************




















