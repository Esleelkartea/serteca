--Función para resetear las secuencias de las tablas
--Cuando se vuelcan datos a una tabla, las secuencias no
--se actualizan, por lo que hay que hacerlo a mano

--esta función recibe como parámetros:

-- 1- el nombre de la tabla
-- 2- el nombre del campo que conforma la secuencia
-- 3- el nombre d ela secuencia

-- lo que hace la función es calcular el valor mas alto
-- del campo dado y acutalizar la secuencia a ese valor

-- de esta manera al dar de alta un nuevo registro ya no dará error

CREATE OR REPLACE FUNCTION resetSecuencia(text, text, text)
  RETURNS void AS
$BODY$DECLARE
 valor int;
 cadena varchar;
 fila RECORD;
BEGIN

cadena:= 'SELECT MAX(' || $2 || ') as VALOR from ' || $1 || ';';
valor:=1;
FOR fila IN EXECUTE cadena LOOP
	valor:=fila.VALOR;
END LOOP;
PERFORM setval($3,valor); 

return;
END;$BODY$
  LANGUAGE 'plpgsql' VOLATILE;
ALTER FUNCTION resetSecuencia(text, text, text) OWNER TO "sertecaUser";

-- la ejecución de la función se realiza de la siguiente manera:

-- select resetsecuencia(NombreTabla, CampoTabla, NombreSecuencia);

-- Ejemplo:
-- select resetsecuencia('clientes', 'id', 'clientes_id_seq');

