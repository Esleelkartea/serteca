package net.idtoki.serteca.group;

import net.idtoki.serteca.model.FacturasPeer;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Feb 01 12:46:43 CET 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class FacturasGroupBean
    extends net.idtoki.serteca.group.BaseFacturasGroupBean
{
  public FacturasGroupBean(){
        this.dbField = FacturasPeer.ID;
                  
//podemos fijar el numero de elementos por pagina recogiendo el entero de un archivo de configuracion
//this.setNumeroElementosPorPagina(int);
//si no se utiliza this.setNumeroElementosPorPagina(); el numero por defecto es 10

  }
}


