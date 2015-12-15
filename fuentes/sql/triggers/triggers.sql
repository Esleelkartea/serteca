-- Function: trgprestamosdelete()

-- DROP FUNCTION trgprestamosdelete();

CREATE OR REPLACE FUNCTION trgprestamosdelete()
  RETURNS opaque AS
$BODY$DECLARE
numero integer:=0;
BEGIN
select count(id) into numero from prestamos where vehiculo_cortesia_id=OLD.vehiculo_cortesia_id AND fecha_fin IS NULL;
if numero>0 then
	update vehiculos_cortesia set estado=1 where id=OLD.vehiculo_cortesia_id;
else
	update vehiculos_cortesia set estado=0 where id=OLD.vehiculo_cortesia_id;
end if;
RETURN NEW;
END;$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION trgprestamosdelete() OWNER TO "sertecaUser";

-- Function: trgprestamosupdate()

-- DROP FUNCTION trgprestamosupdate();

CREATE OR REPLACE FUNCTION trgprestamosupdate()
  RETURNS "trigger" AS
$BODY$DECLARE
numero integer:=0;
BEGIN
select count(id) into numero from prestamos where vehiculo_cortesia_id=NEW.vehiculo_cortesia_id AND fecha_fin IS NULL;
if numero>0 then
	update vehiculos_cortesia set estado=1 where id=NEW.vehiculo_cortesia_id;
	raise notice 'el vehiculo esta prestado';
else
	update vehiculos_cortesia set estado=0 where id=NEW.vehiculo_cortesia_id;
	raise notice 'el vehiculo esta libre';
end if;
RETURN NEW;
END;$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION trgprestamosupdate() OWNER TO "sertecaUser";

-- Function: trgreparacionesinsert()

-- DROP FUNCTION trgreparacionesinsert();


CREATE OR REPLACE FUNCTION trgreparacionesinsert()
  RETURNS "trigger" AS
$BODY$BEGIN
if NEW.responsable='' then
	NEW.responsable:=null;
end if;
if NEW.observacion='' then
	NEW.observacion:=null;
end if;
if NEW.fecha_salida IS NULL then
	if NEW.responsable IS NULL then
		NEW.estado:=0;
	else
		NEW.estado:=1;
	end if;
else
	NEW.estado:=2;
end if;
RETURN NEW;
END;$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION trgreparacionesinsert() OWNER TO "sertecaUser";


-- Function: trgreparacionesupdate()

-- DROP FUNCTION trgreparacionesupdate();

CREATE OR REPLACE FUNCTION trgreparacionesupdate()
  RETURNS "trigger" AS
$BODY$BEGIN
if NEW.responsable='' then
	NEW.responsable:=null;
end if;
if NEW.observacion='' then
	NEW.observacion:=null;
end if;
if NEW.fecha_salida IS NULL then
	if NEW.responsable IS NULL then
		NEW.estado:=0;
	else
		NEW.estado:=1;
	end if;
else
	NEW.estado:=2;
end if;
RETURN NEW;
END;$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION trgreparacionesupdate() OWNER TO "sertecaUser";

-- Function: trgvehiculos_cortesiainsert()

-- DROP FUNCTION trgvehiculos_cortesiainsert();

CREATE OR REPLACE FUNCTION trgvehiculos_cortesiainsert()
  RETURNS "trigger" AS
$BODY$begin
if NEW.estado IS NULL or NEW.estado=-1 then
	NEW.estado:=0;
end if;
return NEW;
end;$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION trgvehiculos_cortesiainsert() OWNER TO "sertecaUser";


-- Function: trgfacturasinsert()

-- DROP FUNCTION trgfacturasinsert();

CREATE OR REPLACE FUNCTION trgfacturasinsert()
  RETURNS "trigger" AS
$BODY$BEGIN
NEW.estado:=0;
return NEW;
END;$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION trgfacturasinsert() OWNER TO "sertecaUser";


-- Function: trgfacturasupdate()

-- DROP FUNCTION trgfacturasupdate();

CREATE OR REPLACE FUNCTION trgfacturasupdate()
  RETURNS "trigger" AS
$BODY$BEGIN
if NEW.estado IS NULL or NEW.estado=-1 then
	if OLD.estado IS NULL then
		NEW.estado:=0;
	else
		NEW.estado:=OLD.estado;
	end if;
end if;
RETURN NEW;
END;$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION trgfacturasupdate() OWNER TO "sertecaUser";



-- Trigger: trg_prestamosdelete on prestamos

-- DROP TRIGGER trg_prestamosdelete ON prestamos;

CREATE TRIGGER trg_prestamosdelete
  AFTER DELETE
  ON prestamos
  FOR EACH ROW
  EXECUTE PROCEDURE trgprestamosdelete();

-- Trigger: trg_prestamosupdate on prestamos

-- DROP TRIGGER trg_prestamosupdate ON prestamos;

CREATE TRIGGER trg_prestamosupdate
  AFTER INSERT OR UPDATE
  ON prestamos
  FOR EACH ROW
  EXECUTE PROCEDURE trgprestamosupdate();


-- Trigger: trg_reparacionesinsert on reparaciones

-- DROP TRIGGER trg_reparacionesinsert ON reparaciones;

CREATE TRIGGER trg_reparacionesinsert
  BEFORE INSERT
  ON reparaciones
  FOR EACH ROW
  EXECUTE PROCEDURE trgreparacionesinsert();


-- Trigger: trg_reparacionesupdate on reparaciones

-- DROP TRIGGER trg_reparacionesupdate ON reparaciones;

CREATE TRIGGER trg_reparacionesupdate
  BEFORE UPDATE
  ON reparaciones
  FOR EACH ROW
  EXECUTE PROCEDURE trgreparacionesupdate();

  
-- Trigger: trg_vehiculos_cortesiainsert on vehiculos_cortesia

-- DROP TRIGGER trg_vehiculos_cortesiainsert ON vehiculos_cortesia;

CREATE TRIGGER trg_vehiculos_cortesiainsert
  BEFORE INSERT
  ON vehiculos_cortesia
  FOR EACH ROW
  EXECUTE PROCEDURE trgvehiculos_cortesiainsert();
  

-- Trigger: trg_facturasinsert on facturas

-- DROP TRIGGER trg_facturasinsert ON facturas;

CREATE TRIGGER trg_facturasinsert
  BEFORE INSERT
  ON facturas
  FOR EACH ROW
  EXECUTE PROCEDURE trgfacturasinsert();
  
  -- Trigger: trg_facturasupdate on facturas

-- DROP TRIGGER trg_facturasupdate ON facturas;

CREATE TRIGGER trg_facturasupdate
  BEFORE UPDATE
  ON facturas
  FOR EACH ROW
  EXECUTE PROCEDURE trgfacturasupdate();
  
  
