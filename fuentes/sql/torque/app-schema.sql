
-----------------------------------------------------------------------------
-- Clientes
-----------------------------------------------------------------------------
DROP TABLE Clientes CASCADE;


CREATE TABLE Clientes
(
                                    id serial,
                                    nombre varchar (50) default '' NOT NULL,
                                    nombrecomercial varchar (50) default '',
                                    razonsocial varchar (50) default '',
                                    nif varchar (10) default '' NOT NULL,
                                    direccion varchar (50),
                                      -- REFERENCES Localidades (id)
    localidad_id integer default -1 NOT NULL,
                                    cp varchar (5),
                                    telefono varchar (10),
                                    movil varchar (10),
                                    fax varchar (10),
                                    email varchar (75),
                                      -- REFERENCES Formas_Pago (id)
    forma_pago_id integer default -1 NOT NULL,
                                    numero_cuenta varchar (20) default '00000000000000000000',
                                    dto_pronto_pago integer default 0,
                                    dia_pago integer default 15 NOT NULL,
                                    observacion varchar (500),
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Localidades
-----------------------------------------------------------------------------
DROP TABLE Localidades CASCADE;


CREATE TABLE Localidades
(
                                    id serial,
                                      -- REFERENCES Provincias (id)
    provincia_id integer default -1 NOT NULL,
                                    nombre varchar (75) default '' NOT NULL,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Provincias
-----------------------------------------------------------------------------
DROP TABLE Provincias CASCADE;


CREATE TABLE Provincias
(
                                    id serial,
                                    nombre varchar (75) default '' NOT NULL,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Vehiculos
-----------------------------------------------------------------------------
DROP TABLE Vehiculos CASCADE;


CREATE TABLE Vehiculos
(
                                    id serial,
                                      -- REFERENCES Modelos (id)
    modelo_id integer,
                                    version varchar (75) default '' NOT NULL,
                                    matricula varchar (8) default '' NOT NULL,
                                      -- REFERENCES Clientes (id)
    cliente_id integer,
                                    chasis_id varchar (20),
                                    motor_id varchar (20),
                                    color varchar (20),
                                    fecha_matriculacion varchar (8),
                                    fecha_revision varchar (8),
                                    observacion varchar (500),
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Modelos
-----------------------------------------------------------------------------
DROP TABLE Modelos CASCADE;


CREATE TABLE Modelos
(
                                    id serial,
                                    nombre varchar (75) default '' NOT NULL,
                                      -- REFERENCES Marcas (id)
    marca_id integer NOT NULL,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Formas_Pago
-----------------------------------------------------------------------------
DROP TABLE Formas_Pago CASCADE;


CREATE TABLE Formas_Pago
(
                                    id serial,
                                    nombre varchar (75) default '' NOT NULL,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Marcas
-----------------------------------------------------------------------------
DROP TABLE Marcas CASCADE;


CREATE TABLE Marcas
(
                                    id serial,
                                    nombre varchar (75) default '' NOT NULL,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Reparaciones
-----------------------------------------------------------------------------
DROP TABLE Reparaciones CASCADE;


CREATE TABLE Reparaciones
(
                                    id serial,
                                    Km integer default 0,
                                    deposito varchar (75) default '',
                                    fecha_entrada varchar (8),
                                    fecha_salida varchar (8),
                                    observacion varchar (500),
                                    estadoprevio varchar (500),
                                    responsable varchar (255),
                                      -- REFERENCES Vehiculos (id)
    vehiculo_id integer NOT NULL,
                                    importe float default 0,
                                    estado integer default 0 NOT NULL,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Ordenes_Trabajo
-----------------------------------------------------------------------------
DROP TABLE Ordenes_Trabajo CASCADE;


CREATE TABLE Ordenes_Trabajo
(
                                    id serial,
                                    fecha_entrada varchar (8),
                                    fecha_salida varchar (8),
                                    observacion varchar (500),
                                      -- REFERENCES Reparaciones (id)
    reparacion_id integer NOT NULL,
                                    importe float default 0,
                                    tipo integer default 0 NOT NULL,
                                      -- REFERENCES Trabajadores (id)
    responsable_id integer NOT NULL,
                                    horas float default 0 NOT NULL,
                                    descripcion varchar (500),
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Categorias
-----------------------------------------------------------------------------
DROP TABLE Categorias CASCADE;


CREATE TABLE Categorias
(
                                    id serial,
                                    nombre varchar (300) default '' NOT NULL,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Trabajadores
-----------------------------------------------------------------------------
DROP TABLE Trabajadores CASCADE;


CREATE TABLE Trabajadores
(
                                    id serial,
                                    numero varchar (10),
                                    fecha_alta varchar (8),
                                    fecha_baja varchar (8),
                                    observacion varchar (500),
                                    nombre varchar (125),
                                    apellidos varchar (255),
                                    apellidosDos varchar (255),
                                    cif varchar (10),
                                    costehora float default 0 NOT NULL,
                                    direccion varchar (50),
                                      -- REFERENCES Localidades (id)
    localidad_id integer default -1 NOT NULL,
                                    cp varchar (5),
                                    telefono varchar (10),
                                    movil varchar (10),
                                    email varchar (75),
                                      -- REFERENCES Categorias (id)
    categoria_id integer,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Facturas
-----------------------------------------------------------------------------
DROP TABLE Facturas CASCADE;


CREATE TABLE Facturas
(
                                    id serial,
                                    fecha varchar (8),
                                    importe float default 0,
                                    estado integer default 0 NOT NULL,
                                    descripcion varchar (500),
                                    observacion varchar (500),
                                      -- REFERENCES Clientes (id)
    cliente_id integer,
                                      -- REFERENCES Reparaciones (id)
    reparacion_id integer,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Lineas_Factura
-----------------------------------------------------------------------------
DROP TABLE Lineas_Factura CASCADE;


CREATE TABLE Lineas_Factura
(
                                    id serial,
                                    observacion varchar (500),
                                      -- REFERENCES Facturas (id)
    factura_id integer NOT NULL,
                                    importe float default 0,
                                    unidades float default 0,
                                    dto float default 0,
                                    descripcion varchar (500),
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Vehiculos_Cortesia
-----------------------------------------------------------------------------
DROP TABLE Vehiculos_Cortesia CASCADE;


CREATE TABLE Vehiculos_Cortesia
(
                                    id serial,
                                      -- REFERENCES Modelos (id)
    modelo_id integer,
                                    chasis_id varchar (20),
                                    version varchar (75) default '' NOT NULL,
                                    matricula varchar (10) default '' NOT NULL,
                                    color varchar (20),
                                    observacion varchar (500),
                                    estado integer default 0,
    PRIMARY KEY (id)
);


-----------------------------------------------------------------------------
-- Prestamos
-----------------------------------------------------------------------------
DROP TABLE Prestamos CASCADE;


CREATE TABLE Prestamos
(
                                    id serial,
                                      -- REFERENCES Vehiculos_Cortesia (id)
    vehiculo_cortesia_id integer,
                                      -- REFERENCES Reparaciones (id)
    reparacion_id integer,
                                    estado_previo varchar (500),
                                    estado_entrega varchar (500),
                                    fecha_ini varchar (8),
                                    fecha_fin varchar (8),
                                    hora_ini varchar (4),
                                    hora_fin varchar (4),
    PRIMARY KEY (id)
);


----------------------------------------------------------------------
-- Prestamos                                                      
----------------------------------------------------------------------

ALTER TABLE Clientes
    ADD CONSTRAINT Clientes_FK_1 FOREIGN KEY (localidad_id)
    REFERENCES Localidades (id)
;
ALTER TABLE Clientes
    ADD CONSTRAINT Clientes_FK_2 FOREIGN KEY (forma_pago_id)
    REFERENCES Formas_Pago (id)
;

----------------------------------------------------------------------
-- Clientes                                                      
----------------------------------------------------------------------

ALTER TABLE Localidades
    ADD CONSTRAINT Localidades_FK_1 FOREIGN KEY (provincia_id)
    REFERENCES Provincias (id)
;

----------------------------------------------------------------------
-- Localidades                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- Provincias                                                      
----------------------------------------------------------------------

ALTER TABLE Vehiculos
    ADD CONSTRAINT Vehiculos_FK_1 FOREIGN KEY (modelo_id)
    REFERENCES Modelos (id)
;
ALTER TABLE Vehiculos
    ADD CONSTRAINT Vehiculos_FK_2 FOREIGN KEY (cliente_id)
    REFERENCES Clientes (id)
;

----------------------------------------------------------------------
-- Vehiculos                                                      
----------------------------------------------------------------------

ALTER TABLE Modelos
    ADD CONSTRAINT Modelos_FK_1 FOREIGN KEY (marca_id)
    REFERENCES Marcas (id)
;

----------------------------------------------------------------------
-- Modelos                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- Formas_Pago                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- Marcas                                                      
----------------------------------------------------------------------

ALTER TABLE Reparaciones
    ADD CONSTRAINT Reparaciones_FK_1 FOREIGN KEY (vehiculo_id)
    REFERENCES Vehiculos (id)
;

----------------------------------------------------------------------
-- Reparaciones                                                      
----------------------------------------------------------------------

ALTER TABLE Ordenes_Trabajo
    ADD CONSTRAINT Ordenes_Trabajo_FK_1 FOREIGN KEY (reparacion_id)
    REFERENCES Reparaciones (id)
;
ALTER TABLE Ordenes_Trabajo
    ADD CONSTRAINT Ordenes_Trabajo_FK_2 FOREIGN KEY (responsable_id)
    REFERENCES Trabajadores (id)
;

----------------------------------------------------------------------
-- Ordenes_Trabajo                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- Categorias                                                      
----------------------------------------------------------------------

ALTER TABLE Trabajadores
    ADD CONSTRAINT Trabajadores_FK_1 FOREIGN KEY (localidad_id)
    REFERENCES Localidades (id)
;
ALTER TABLE Trabajadores
    ADD CONSTRAINT Trabajadores_FK_2 FOREIGN KEY (categoria_id)
    REFERENCES Categorias (id)
;

----------------------------------------------------------------------
-- Trabajadores                                                      
----------------------------------------------------------------------

ALTER TABLE Facturas
    ADD CONSTRAINT Facturas_FK_1 FOREIGN KEY (cliente_id)
    REFERENCES Clientes (id)
;
ALTER TABLE Facturas
    ADD CONSTRAINT Facturas_FK_2 FOREIGN KEY (reparacion_id)
    REFERENCES Reparaciones (id)
;

----------------------------------------------------------------------
-- Facturas                                                      
----------------------------------------------------------------------

ALTER TABLE Lineas_Factura
    ADD CONSTRAINT Lineas_Factura_FK_1 FOREIGN KEY (factura_id)
    REFERENCES Facturas (id)
;

----------------------------------------------------------------------
-- Lineas_Factura                                                      
----------------------------------------------------------------------

ALTER TABLE Vehiculos_Cortesia
    ADD CONSTRAINT Vehiculos_Cortesia_FK_1 FOREIGN KEY (modelo_id)
    REFERENCES Modelos (id)
;

----------------------------------------------------------------------
-- Vehiculos_Cortesia                                                      
----------------------------------------------------------------------

ALTER TABLE Prestamos
    ADD CONSTRAINT Prestamos_FK_1 FOREIGN KEY (vehiculo_cortesia_id)
    REFERENCES Vehiculos_Cortesia (id)
;
ALTER TABLE Prestamos
    ADD CONSTRAINT Prestamos_FK_2 FOREIGN KEY (reparacion_id)
    REFERENCES Reparaciones (id)
;
